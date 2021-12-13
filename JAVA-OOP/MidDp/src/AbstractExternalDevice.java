
public abstract class AbstractExternalDevice extends AbstractNotebookComputer{
	
	private String deviceType;
	private AbstractNotebookComputer computer;
	public void setComputer(AbstractNotebookComputer computer) {
		this.computer = computer;
	}
	public AbstractNotebookComputer getComputer() {
		return computer;
	}
	AbstractExternalDevice(String type,AbstractNotebookComputer computer){
		setDeviceType(type);
		setComputer(computer);
	}
	
	public void setDeviceType(String type) {
		this.deviceType = type;
	}
	
	public String getDeviceType() {
		return deviceType;
	}
	
	public abstract void setTypeSpace();
	public abstract double getTypeSpace();
	
	@Override
	public double requiredSpace() {
		double totalSpace;
		totalSpace = computer.requiredSpace();
		totalSpace += getTypeSpace();
		return totalSpace;	
		
	}
	
	@Override
	public String toString() {
		return computer.toString() +", " +getDeviceType();
	}

}
