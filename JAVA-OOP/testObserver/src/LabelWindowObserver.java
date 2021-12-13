
public class LabelWindowObserver implements Observer{
	
	LabelWindow labelwindow;
	
	
	LabelWindowObserver(LabelWindow labelwindow){
		this.labelwindow =labelwindow;
	}

	@Override
	public void update(String msg) {
			labelwindow.updateText(msg);
	}

	
	
	
	
	
}
