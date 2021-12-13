import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//ArrayList arr = new ArrayList();
		IntDynamicArray arr = new IntDynamicArray();
		for(int i=0; i<15;i++) {
			arr.add(i);
		}
		for(int i=0; i< arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		for(Iterator itr =arr.iterator();itr.hasNext();) {

			System.out.println(itr.next());
		}
		
		for(Object n : arr) {
			System.out.println((Integer) n);
		}
	}

}
