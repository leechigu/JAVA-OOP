import java.util.Date;

public class FileInfo {
	String name;
	String type;
	int size;
	Date modifiedDate;
	
	FileInfo(String name,String type,int size,Date modified)
	{
		this.name = name;
		this.type =type;
		this.size = size;
		this.modifiedDate =modified;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
		
	}
	public int getSize() {
		return size;
		
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	@Override
	public String toString() {
		return getName() +"  "+ getType() +" " +getSize() +"  "+ getModifiedDate();
	}
	

}
