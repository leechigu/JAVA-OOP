import java.util.ArrayList;
import java.util.Iterator;

public class DataCollectionAdapter<T> implements DataCollection<T> {

	ArrayList<T> arrList;
	DataCollectionAdapter(){	
		arrList = new ArrayList<T>();
	}
	
	@Override
	public boolean put(T t) {
		return arrList.add(t);
	}

	@Override
	public T elemAt(int index) {
		
		return arrList.get(index);
		
	}

	@Override
	public int length() {
		return arrList.size();
	}

	@Override
	public Iterator createIterator() {
		return arrList.iterator();
		
	}

}
