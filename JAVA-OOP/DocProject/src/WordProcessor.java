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
			System.out.println(fileName+" ."+ext+"�� ��ȯ�ؼ� �����մϴ�.");
		}
		else {
			System.out.println(ext +"���� ������ �����ϴ� DocConverter�� �����ϴ�.");
		}
	}
	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public void checkSpelling() {
		spellChecker.check();
	}
	
}
