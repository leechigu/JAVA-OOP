import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

// ��� �������� ��ȯ�ϴ� �ڵ�
class GreyImageConverter {
    public static void main(String[] args) {
        final String HOUSE = "house.png"; // ���� ���� ���� �̸�
        
        // ��ü���� �̹��� ���� ����� �������� IOException�� �߻��� �� �־� ���� ó�� �ڵ带 ����
        try {       
            // �̹��� ���� �����͸� �޸𸮿� ����
            BufferedImage image = ImageIO.read(new File(HOUSE));

            // �̹����� �� �ȼ� ������ ���� �÷� ��ȯ�� �� �� �ٽ� ����
            for(int y = 0; y < image.getHeight(); y++) {
               for(int x = 0; x < image.getWidth(); x++) {
                   // (x, y)�� �ش�Ǵ� �ȼ��� RGB ������ �޾Ƽ� Color�� ����
                   Color color = new Color(image.getRGB(x, y));
                   // RGB ���� ���� �о �÷� ��ȯ(���⼭�� ������� ��ȯ)
                   int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                   int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                   int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
                   // ���� ������� RGB ���� (x, y)��ǥ �ȼ� �÷��� ����
                   image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
               }
            }
            // �̹��� ������ png ���� �������� ����
            // ���� �̸��� HOUSE(house.png)�� "g_"�� �տ� ���� ������ ����
            ImageIO.write(image, "png", new File("g_" + HOUSE));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}