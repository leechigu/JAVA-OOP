import java.util.HashMap;
import java.util.Map;

public class WordProcessor {

	ISpellChecker spellChecker;
	Map<String,DocConverter> docConverter;
	String fileName;
	
	
	WordProcessor(String fileName){
		docConverter = new HashMap<String,DocConverter>();
		this.fileName =  fileName;
	}
	public void addDocConverter(DocConverter converter) {
		docConverter.put(converter.getExtension(), converter);
	}
	
	public void convertDocTo(String ext){
		if(docConverter.get(ext)!=null) {
			System.out.println(fileName+" ."+ext+"로 변환해서 저장합니다.");
		}
		else {
			System.out.println(ext +"파일 형식을 지원하는 DocConverter가 없습니다.");
		}
	}
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void checkSpelling() {
		spellChecker.check();
	}
	
}
