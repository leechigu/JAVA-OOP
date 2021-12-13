import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface{

	String fileName;
	ArrayList<String> arrlist;
	
	LoadHudDisplays(String fileName){
		this.fileName = fileName;
		arrlist = new ArrayList<String>();
	}
	@Override
	public ArrayList<String> load() {
		
		File file = new File(fileName);
		FileReader reader;
		try {
			reader = new FileReader(file);
			BufferedReader bufReader =new BufferedReader(reader);
			String line;
			while((line = bufReader.readLine())!=null) {
				arrlist.add(line);
			}
			bufReader.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
		
		
		return arrlist;
	}

}
