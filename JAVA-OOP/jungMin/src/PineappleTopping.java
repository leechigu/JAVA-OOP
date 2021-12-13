

public class PineappleTopping extends AbstractTopping{

	
	PineappleTopping(AbstractPizza pizza){
		super(pizza);
		super.setToppingName("pineapple topping");
	}
	
	@Override
	public double getToppingWeight() {
		return 45.0;
	}
	
}