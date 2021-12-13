import java.util.ArrayList;
import java.util.List;

public class IDE implements Builder {

	
	String projectName;
	Preprocessor preProcessor;
	Compiler compiler;
	Linker linker;
	
	IDE(Preprocessor preProcessor,Compiler compiler,Linker linker){
		
		this.preProcessor =preProcessor;
		this.compiler =compiler;
		this.linker =linker;
	}
	
	@Override
	public void createProject(String projectName) {
		
		this.projectName = projectName;
		
	}

	@Override
	public void build(SourceCode[] sourceCode) {
		System.out.println("IDE에서 소스 코드 배열을 이용해서 빌드 후 실행");
		ObjectCode[] obarr = new ObjectCode[sourceCode.length];
		
		for(int i = 0;i<sourceCode.length;i++) {
			preProcessor.preprocess(sourceCode[i]);
			obarr[i] = compiler.compile(sourceCode[i]);
		}
		
		Executable exec = linker.link(projectName, obarr);
		exec.execute();
	}

	@Override
	public void build(List<SourceCode> scList) {
		System.out.println("IDE에서 소스 코드 리스트를 이용해서 빌드 후 실행");
		List<ObjectCode> ocList = new ArrayList<>();
		
		for(int i = 0;i<scList.size();i++) {
			preProcessor.preprocess(scList.get(i));
			ocList.add(compiler.compile(scList.get(i)));
		}
		
		Executable exec = linker.link(projectName, ocList);
		exec.execute();
	}
	
	/*
    createProject()는 새로운 프로젝트_이름을 지정하기 위해 사용됨
    build() 함수는 두 가지 버전이 있음. build() 함수는 각각 SourceCode 배열(SourceCode[]) 또는 
    SourceCode 리스트(List<SourceCode>)를 입력 받고 Preprocessor, Compiler, Linker의 인터페이스를 활용해서
    preprocessing, compiling, linking을 순서대로 실행한 후 Executable 객체를 생성함.
    이 때 Executable의 실행 파일 이름은 createProject()에 전달된 "프로젝트_이름.exe"가 됨
    예: createProject()에 "new"라는 문자열이 전달되면, build()에서 생성하는 Executable의 실행 파일 이름은 "new.exe"가 됨
    createProject(), build() 함수 2개에 해당되는 함수 헤더를 아래에 작성하고, 이를 구현하는 IDE 클래스를 만들 것
  */
  
  /* 
  
  함수 헤더 선언
  
  */

	
}
