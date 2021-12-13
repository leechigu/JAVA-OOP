import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

class InverseImageConverter extends Converter{
	
	String type;

	InverseImageConverter(){
		super.type = "i_";
	}
	
	@Override
	public int ConvertC(Color color) {
		int outputRed = 255 - color.getRed();
        int outputGreen = 255 - color.getGreen();
        int outputBlue = 255 - color.getBlue();
		return new Color(outputRed, outputGreen, outputBlue).getRGB();
	}
	
	

}