
public abstract class Sorter {
	
	public void bubbleSort(Person[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if(compareP(data[j],data[j+1])) {
                	Person temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
	

	public abstract boolean compareP(Person p1,Person p2);
}
