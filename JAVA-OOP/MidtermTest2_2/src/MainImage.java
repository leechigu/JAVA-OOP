
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainImage implements Image{
	
	
	
	MainImage(){
		
	}
	
	
	@Override
	public BufferedImage ConvertImage() {
		BufferedImage image=null;
		try {       
            image = ImageIO.read(new File("house.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
		return image;
	}

	@Override
	public String type() {
		return "house.png";
	}
}
