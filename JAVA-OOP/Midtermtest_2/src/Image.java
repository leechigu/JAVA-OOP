import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Image {

	
	
	Image(){
	}
	
	BufferedImage image;
	String Name;
	
	
	
	public abstract String setName();
	public abstract BufferedImage ConvertColor();
	
	
	
}
