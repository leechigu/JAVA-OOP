
public class PdfDocConverter extends DocConverter {
	
	public PdfDocConverter() {
		super("pdf");
	}

	@Override 
	public void save(String file) {
		System.out.println(file+"."+super.getExtention()+"�� ��ȯ�ؼ� �����մϴ�.");
	}
}
