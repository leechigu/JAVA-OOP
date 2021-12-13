
public class NotebookComputer extends AbstractNotebookComputer{

	
	private String owner;
	NotebookComputer(String owner){
		setOwner(owner);
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	@Override
	public double requiredSpace() {
		return 250.0;
	}
	@Override
	public String toString() {
		return owner+"'s Notebook computer";
	}
	
	
	
	

}
