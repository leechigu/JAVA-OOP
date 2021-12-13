import javax.swing.JPanel;

public abstract class InfoDisplayDecorator extends DisplayDecorator {
    
	JPanel panel;
    LabelPanel labelPanel;
	Display displayComponent;
	
	InfoDisplayDecorator (Display display, int width, int height){
		super(width, height);
		this.displayComponent = display;
		
	}
	@Override
	public JPanel create() {
		 // 레이블을 담을 패널 생성
        panel = displayComponent.create();
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return panel;
	}
	@Override
	public void show() {
		displayComponent.show();
		labelPanel.updateText(getDisplayText());
	}
	public int getHeight() {
		return displayComponent.getHeight()+super.getHeight();
	}
	public abstract String getDisplayText();
}

