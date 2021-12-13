
public class TextFieldWindowObserver implements Observer{
	
	private Subject subject;
	private TextFieldWindow textFieldWindow;
	public TextFieldWindowObserver(Subject subject,TextFieldWindow textFieldWindow) {
		this.subject = subject;
		this.textFieldWindow = textFieldWindow;
		this.create();
	}
	public void update(int number) {
		textFieldWindow.updateText(String.valueOf(number));
	}
	
	public void create() {
		subject.addObserver(this);
	}

}
