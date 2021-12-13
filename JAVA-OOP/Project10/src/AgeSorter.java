public class AgeSorter extends Sorter{

	@Override
	public boolean compareP(Person p1, Person p2) {
		int age1 = p1.getAge();
		int age2 = p2.getAge();
		if(age1>age2) {return true;}
		else return false;
	}
}
