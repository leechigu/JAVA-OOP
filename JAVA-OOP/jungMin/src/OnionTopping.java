

public class OnionTopping extends AbstractTopping{

	
	OnionTopping(AbstractPizza pizza){
		super(pizza);
		super.setToppingName("onion topping");
	}
	
	@Override
	public double getToppingWeight() {
		return 30.0;
	}
	
	

}
