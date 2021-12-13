
public class CompareFileType implements Comparable {
	
	
	
	@Override
	public int compareTo(Object o1, Object o2) {
		
		FileInfo file1 = (FileInfo) o1;
		FileInfo file2 = (FileInfo) o2;
		
		
		
		return file1.type.compareTo(file2.type);
	}
	    

}
