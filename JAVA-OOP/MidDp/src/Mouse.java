
public class Mouse extends AbstractExternalDevice{
	
	private double typeSpace;
	
	Mouse(String type,AbstractNotebookComputer computer){
		super(type,computer);
		setTypeSpace();
	}

	@Override
	public void setTypeSpace() {
		this.typeSpace = 30.0;
		
	}
	@Override
	public double getTypeSpace() {
		return typeSpace;
	}


}
