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
		//���� ��ȯ ��ü�� Map�� �߰� (Ű�� Ȯ���� ���� DocConverter)
		docConverters.put(converter.getExtention(), converter);
		
	}
	void convertDocTo(String ext) {
		//Ư�� Ȯ���� ���·� ���� ��ȯ ����
		if(docConverters.containsKey(ext)) {
			docConverters.get(ext).save(fileName);
		}
		else {
			System.out.println(ext+"���� ������ �����ϴ� DocConverter�� �����ϴ�.");
		}
	}
	void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker =  spellChecker;
	}
	void checkSpelling() {
		spellChecker.check();
	}

}
