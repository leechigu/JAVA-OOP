import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {
	
	
	public static void main(String[] args) {
		
		final String HOUSE = "house.png"; 
		Converter converter;
		converter = new GreyImageConverter(HOUSE);
		converter.ConvertImage();
		converter = new InverseImageConverter(HOUSE);
		converter.ConvertImage();
		converter = new SepiaImageConverter(HOUSE);
		converter.ConvertImage();
        
        
        
    }
	

}
