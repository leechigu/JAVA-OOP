import java.awt.Color;
import java.awt.image.BufferedImage;

public class SepiaImageConverter extends Decorator{
	
	Image image;
	SepiaImageConverter(Image image) {
		super(image);
		this.image =image;
		
	}

	@Override
	public BufferedImage ConvertColor() {
		
		BufferedImage bufimage = image.ConvertColor();
		
		for(int y = 0; y < bufimage.getHeight(); y++) {
            for(int x = 0; x < bufimage.getWidth(); x++) {
                Color color = new Color(bufimage.getRGB(x, y));
                int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                int outputRed = 230 * grey / 255;
                int outputGreen = 180 * grey / 255;
                int outputBlue =  150 * grey / 255;
                bufimage.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
         }
		
		return bufimage;
	}
	

	@Override
	public String setName() {
		return "s_"+image.setName();
	}

	

}
