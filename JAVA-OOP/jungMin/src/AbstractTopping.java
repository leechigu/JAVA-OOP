
public abstract class AbstractTopping extends AbstractPizza{
	
	private String toppingName;
	
	private AbstractPizza pizza;
	
	public void setPizza(AbstractPizza pizza) {
		this.pizza =pizza;
	}
	public void setToppingName(String name) {
		this.toppingName = name;
	}
	public String getToppingName()
	{
		return toppingName;
	}
	
	AbstractTopping(AbstractPizza pizza){
		setPizza(pizza);
	}
	
	public abstract double getToppingWeight();
	
	@Override
	public String toString() {
		return pizza.toString() +", "+ getToppingName();
	} 
	
	@Override
	public double weight() {
		double totalWeight = pizza.weight();
		totalWeight += getToppingWeight();
		return totalWeight;
		
	}
	

}
