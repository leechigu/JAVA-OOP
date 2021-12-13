
public class Keyboard extends AbstractExternalDevice{
	private double typeSpace;
	
	Keyboard(String type,AbstractNotebookComputer computer){
		super(type,computer);
		setTypeSpace();
	}

	@Override
	public void setTypeSpace() {
		this.typeSpace = 80.0;
		
	}

	@Override
	public double getTypeSpace() {
		return typeSpace;
	}
	

}
