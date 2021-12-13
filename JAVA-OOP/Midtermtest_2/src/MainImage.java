import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainImage extends Image{

	BufferedImage bufimage;
	String filename;
	
	MainImage(String filename) {
		this.filename = filename;
	}
	
	
	@Override
	public BufferedImage ConvertColor() {
		try {
			bufimage = ImageIO.read(new File(filename));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return bufimage;
	}
	
	@Override
	public String setName() {
		return filename;
		
	}

	
	
	
	
}
