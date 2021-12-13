
public class SourceCode {
	
	String fileName;
	
	public SourceCode(String fileName){
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String newFileName) {
		this.fileName = newFileName;
	}
	
	public boolean isCcode() {
		String temp = getFileName();
		String arrt[] = temp.split("\\.");
		
		if(arrt[1].equals("c")) {
			return true;
			
		}
		else 
			return false;
	}
	

}
