import javax.swing.JPanel;

public class WeatherDisplay extends InfoDisplayDecorator{

	public WeatherDisplay (Display display, int width, int height){
		super(display,width, height);
	}
	
	@Override
	public String getDisplayText() {
		return "날씨가 좋습니다";
	}

}
