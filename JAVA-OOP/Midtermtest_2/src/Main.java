import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

	
	BufferedImage bufimage;
	

	Decorator decorator;
	 public static void main(String[] args) {
	        Image image; 
	        String filename = "house.png";
	        image = new MainImage(filename);
	        image = new GreyImageConverter(image);
	        image = new InverseImageConverter(image);
	        image = new SepiaImageConverter(image);
	        String finalfilename= image.setName();
	        BufferedImage bufimage = image.ConvertColor();
	        
	        
	        try {
    			ImageIO.write(bufimage, "png", new File(finalfilename));
    		} catch (IOException e) {
    			
    			e.printStackTrace();
    		}

	    }

}
