
public class CompareFileName implements Comparable{
	
	
	@Override
	public int compareTo(Object o1, Object o2) {
		
		FileInfo file1 = (FileInfo) o1;
		FileInfo file2 = (FileInfo) o2;
		
		return file1.name.compareTo(file2.name);
		
	}
	    

}
