
public class TextFieldWindowObserver implements Observer {

	TextFieldWindow textFieldwindow;
	
	
	TextFieldWindowObserver(TextFieldWindow textFieldwindow){
		this.textFieldwindow =textFieldwindow;
	}

	@Override
	public void update(String msg) {
		textFieldwindow.updateText(msg);
	}

	
	
	
}
