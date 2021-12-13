
public class PepperoniTopping extends AbstractTopping{

	
	PepperoniTopping(AbstractPizza pizza){
		super(pizza);
		super.setToppingName("pepperoni topping");
	}
	
	@Override
	public double getToppingWeight() {
		return 25.0;
	}
	
}