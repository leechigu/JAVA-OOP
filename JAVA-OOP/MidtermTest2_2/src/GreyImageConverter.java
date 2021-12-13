import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

// ��� �������� ��ȯ�ϴ� �ڵ�
class GreyImageConverter extends Converter{
	Image image;
	
	GreyImageConverter(Image image){
		super(image);
		super.type = "g_";
		this.image =image;
	}
	@Override
	public int ConvertC(Color color) {
		int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        return new Color(outputRed, outputGreen, outputBlue).getRGB();
	}
	
	

}