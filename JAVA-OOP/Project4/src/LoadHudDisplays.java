import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface{

	ArrayList<String> fileLine;
	
	
	LoadHudDisplays(String filename){
		fileLine = new ArrayList<String>();
		try {
			File file = new File(filename);
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader =  new BufferedReader(filereader);
			String line="";
			while((line = bufReader.readLine())!=null) {
				fileLine.add(line);
			}
			bufReader.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
	
	public ArrayList<String> load(){
		return fileLine;
	}
	
}
