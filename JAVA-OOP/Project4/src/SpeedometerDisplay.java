
import javax.swing.JPanel;

public class SpeedometerDisplay extends InfoDisplayDecorator{

	public SpeedometerDisplay (Display display, int width, int height){
		super(display,width, height);
	}
	
	@Override
	public String getDisplayText() {
		return "�ӵ��� �����ϴ�";
	}
}
