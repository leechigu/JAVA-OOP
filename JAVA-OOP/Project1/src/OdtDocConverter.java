
public class OdtDocConverter extends DocConverter {

	
	public OdtDocConverter() {
		super("odt");
	}

	@Override 
	public void save(String file) {
		System.out.println(file+"."+super.getExtention()+"로 변환해서 저장합니다.");
	}
	
}
