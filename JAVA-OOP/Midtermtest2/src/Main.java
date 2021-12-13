
public class Main {

	public static void main(String[] args) {
	
		final String HOUSE = "house.png";
		Converter greyconverter= new GreyImageConverter();
		greyconverter.ConvertImage(HOUSE);
		
		Converter inverseconverter= new InverseImageConverter();
		inverseconverter.ConvertImage(HOUSE);
		
		Converter sepiaconverter = new SepiaImageConverter();
		sepiaconverter.ConvertImage(HOUSE);
		
		
		
		
	}
	
	
}
