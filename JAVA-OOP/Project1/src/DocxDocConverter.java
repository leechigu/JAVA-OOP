
public class DocxDocConverter extends DocConverter {
	public DocxDocConverter() {
		super("docx");
	}

	@Override 
	public void save(String file) {
		System.out.println(file+"."+super.getExtention()+"로 변환해서 저장합니다.");
	}

}
