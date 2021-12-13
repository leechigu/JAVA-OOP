
public abstract class DocConverter {

	private String ext;
	
	public DocConverter(String extention) {
		ext = extention;
	}
	
	public String getExtention() {
		return ext;
	}
	
	public abstract void save(String fileName);
	
}
