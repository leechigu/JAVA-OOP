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
                // (x, y)�� �ش�Ǵ� �ȼ��� RGB ������ �޾Ƽ� Color�� ����
                Color color = new Color(bufimage.getRGB(x, y));
                // RGB ���� ���� �о �÷� ��ȯ(���⼭�� ������� ��ȯ)
                int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                // ���� ������� RGB ���� (x, y)��ǥ �ȼ� �÷��� ����
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
