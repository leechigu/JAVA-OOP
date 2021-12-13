
public class LEDMonitor extends AbstractExternalDevice{

	private double typeSpace;
	
	LEDMonitor(String type,AbstractNotebookComputer computer){
		super(type,computer);
		setTypeSpace();
	}
	@Override
	public void setTypeSpace() {
		this.typeSpace = 150.0;
		
	}
	
	@Override
	public double getTypeSpace() {
		return typeSpace;
	}
	

}
