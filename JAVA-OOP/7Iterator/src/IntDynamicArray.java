import java.util.Iterator;

public class IntDynamicArray implements Iterable{

	final int INCREMENT_SIZE = 10;
	private int[] arr;
	int count;
	int size;
	
	public IntDynamicArray() {
		arr =new int[INCREMENT_SIZE];
		count =0;
		size =INCREMENT_SIZE;
	}
	
	public void add(int n) {
		if(count>=size) {
			int[] arr2 = new int[size + INCREMENT_SIZE];
			for(int i = 0; i<size;i++) {
				arr2[i] =arr[i];
			}
			size+=INCREMENT_SIZE;
			arr = arr2;
		}
		arr[count] =n;
		count++;
	}



	public int get(int idx) throws ArrayIndexOutOfBoundsException{
	
		if(idx<size) {
			return arr[idx];
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}


	public int size() {
		return this.count;
	}
	public Iterator iterator() {
		return new IntDynamicArrayIterator(this);
	}
}
