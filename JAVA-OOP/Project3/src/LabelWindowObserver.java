
public class LabelWindowObserver implements Observer{

	private Subject subject;
	private LabelWindow labelWindow;
	public LabelWindowObserver(Subject subject,LabelWindow labelWindow) {
		this.subject = subject;
		this.labelWindow = labelWindow;
		this.create();
	}
	public void update(int primeNumber) {
		labelWindow.updateText(String.valueOf(primeNumber));
	}
	
	public void create() {
		subject.addObserver(this);
	}


}
