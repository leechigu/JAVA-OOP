
public class CPreprocessor implements Preprocessor{

	@Override
	public SourceCode preprocess(SourceCode sourceCode) {
		
		int nameLength = sourceCode.getFileName().length();
		String checkString = sourceCode.getFileName();
		
		if(sourceCode.isCcode()) {
			System.out.println("Preprocessing C code: "+sourceCode.getFileName());
			sourceCode.setFileName("preprocessed_"+sourceCode.getFileName());
			System.out.println("Generating a new C code: "+sourceCode.getFileName());
			return sourceCode;
		}
		else {
			System.out.println("C코드가 아닙니다.");
			return sourceCode;
		}
	}
	
	

	
}
