
public class CompareSize implements Comparable{
	@Override
	public int compareTo(Object o1, Object o2) {
		FileInfo x = (FileInfo)o1;
		FileInfo y = (FileInfo)o2;
		return x.getSize()-y.getSize();
		
	}
	

}
