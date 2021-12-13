import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Converter {
	
	String filename;
	String type;
	
	Converter(String filename){
		this.filename = filename;
	}
	
	public abstract BufferedImage ConvertColor(BufferedImage bufferImage);
	
	public BufferedImage ConvertImage() {
		BufferedImage rawImage;	
		rawImage = open();
		BufferedImage changedImage = ConvertColor(rawImage);
		save(changedImage);
		return changedImage;
	}
	
	public BufferedImage open() {
		BufferedImage image=null;
		try {
			image = ImageIO.read(new File(filename));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return image;
	}

	public void save(BufferedImage image) {
        try {
			ImageIO.write(image, "png", new File(type + filename));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
	
	



}
