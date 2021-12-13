import java.util.HashMap;

import java.util.Map;


public class WordProcessor {
	String fileName;
	Map<String, DocConverter> docConverters = new HashMap<String,DocConverter>();
	ISpellChecker spellChecker;
	
	WordProcessor(String fileName){
		this.fileName =  fileName;
	}
	
	void addDocConverter(DocConverter converter) {
		//문서 변환 객체를 Map에 추가 (키는 확장자 값은 DocConverter)
		docConverters.put(converter.getExtention(), converter);
		
	}
	void convertDocTo(String ext) {
		//특정 확장자 형태로 파일 변환 저장
		if(docConverters.containsKey(ext)) {
			docConverters.get(ext).save(fileName);
		}
		else {
			System.out.println(ext+"파일 형식을 지원하는 DocConverter가 없습니다.");
		}
	}
	void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker =  spellChecker;
	}
	void checkSpelling() {
		spellChecker.check();
	}

}
