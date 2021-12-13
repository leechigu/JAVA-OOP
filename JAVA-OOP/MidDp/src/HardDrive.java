
public class HardDrive extends AbstractExternalDevice {
	private double typeSpace;
	
	HardDrive(String type,AbstractNotebookComputer computer){
		super(type,computer);
		setTypeSpace();
	}

	@Override
	public void setTypeSpace() {
		this.typeSpace = 40.0;
		
	}

	@Override
	public double getTypeSpace() {
		return typeSpace;
	}
	


}
