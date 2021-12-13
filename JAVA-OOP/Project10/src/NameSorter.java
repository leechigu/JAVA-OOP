public class NameSorter extends Sorter{

	@Override
	public boolean compareP(Person p1, Person p2) {
		String name1 = p1.getName();
		String name2 = p2.getName();
		if(name1.compareTo(name2)>0) {
			return true;
		}
		else
			return false;
		
	}

}
