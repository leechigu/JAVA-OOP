
public class ExtraCheeseTopping extends AbstractTopping{

	
	ExtraCheeseTopping (AbstractPizza pizza){
		super(pizza);
		super.setToppingName("extra cheese topping");
	}
	
	@Override
	public double getToppingWeight() {
		return 40.0;
		
	}
	
}	