import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Converter implements Image{
	
	String type;
	Image imagee;
	public Converter(Image imagee){
		this.imagee  = imagee;
	}
	@Override	
	public BufferedImage ConvertImage() {
		BufferedImage image= imagee.ConvertImage();
		for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                int changedColor = ConvertC(color);
                image.setRGB(x, y, changedColor);
            }
         }     
		return image;
	}
	@Override
	public String type() {
		return getType() + imagee.type();
	}
	
	
	public String getType() {
		return type;
	}
	
	public abstract int ConvertC(Color color);
}
