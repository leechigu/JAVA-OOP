import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TimeDisplay extends Display{

	JPanel panel;
	Display display;
	LabelPanel labelPanel;
	
	
	public  TimeDisplay(Display display,int width, int height) {
		super(width, height);
		this.display = display;
	}

	@Override
	public JPanel create() {
		panel = display.create();
		
		labelPanel = new LabelPanel();
		panel.add(labelPanel.createPanel(getWidth(), getHeight()));
		return panel;
	}

	@Override
	public void show() {
		
		display.show();
		labelPanel.updateText("SpeedometerDisplay");
	}

}
