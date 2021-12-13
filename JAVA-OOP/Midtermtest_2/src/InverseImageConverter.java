import java.awt.Color;
import java.awt.image.BufferedImage;

public class InverseImageConverter extends Decorator{
	
	
	
	Image image;
	InverseImageConverter(Image image) {
		super(image);
		this.image =image;
		
	}

	@Override
	public BufferedImage ConvertColor() {
		
		BufferedImage bufimage = image.ConvertColor();
		for(int y = 0; y < bufimage.getHeight(); y++) {
            for(int x = 0; x < bufimage.getWidth(); x++) {
                Color color = new Color(bufimage.getRGB(x, y));
                int outputRed = 255 - color.getRed();
                int outputGreen = 255 - color.getGreen();
                int outputBlue = 255 - color.getBlue();
               bufimage.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
         }
		
		
		return bufimage;
	}
	

	@Override
	public String setName() {
		return "i_"+image.setName();
	}

	

}
