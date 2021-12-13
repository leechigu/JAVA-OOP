import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Converter {
	
	String type;
	public Converter(){
		
	}
		
	public void ConvertImage(String filename) {
		try {       
            BufferedImage image = ImageIO.read(new File(filename));

            for(int y = 0; y < image.getHeight(); y++) {
               for(int x = 0; x < image.getWidth(); x++) {
                   Color color = new Color(image.getRGB(x, y));
                   int changedColor = ConvertC(color);
                   image.setRGB(x, y, changedColor);
               }
            }
            ImageIO.write(image, "png", new File(getType() + filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public String getType() {
		return type;
	};
	public abstract int ConvertC(Color color);

}
