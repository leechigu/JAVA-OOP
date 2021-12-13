import java.awt.Color;
import java.awt.image.BufferedImage;

public class GreyImageConverter extends Decorator{

	
	Image image;
	
	GreyImageConverter(Image image) {
		super(image);
		this.image =image;
		
	}

	@Override
	public BufferedImage ConvertColor() {
		
		BufferedImage bufimage = image.ConvertColor();
		for(int y = 0; y < bufimage.getHeight(); y++) {
            for(int x = 0; x < bufimage.getWidth(); x++) {
                // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
                Color color = new Color(bufimage.getRGB(x, y));
                // RGB 값을 각각 읽어서 컬러 변환(여기서는 흑백으로 변환)
                int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                bufimage.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
            }
         }
		
	
		return bufimage;
	}
	

	@Override
	public String setName() {
		return "g_"+image.setName();
	}

	
	
}
