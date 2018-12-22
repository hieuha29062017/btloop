package generatedata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import entity.Entity;
import entity.Location;
import entity.Source;

public class GenerateLocation implements IGenerateData {
	
	private static ArrayList<String> listNation = new ArrayList<String>();
	private static ArrayList<String> listLocationName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
		
	public GenerateLocation() throws IOException{
		BufferedReader inputStream = null;
	
		try{
			inputStream = new BufferedReader(new FileReader("locationInfor.txt"));
				
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				listLocationName.add(vs);
			}
				
			while((vs = inputStream.readLine()) != null && !vs.equals("-2")){
				listDescription.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-3")){
				Source temp = new Source(vs);
				listSource.add(temp);
			}
			while((vs = inputStream.readLine()) != null && !vs.equals("-4")){
				listNation.add(vs);
			}
			
		}
		finally{
			if(inputStream != null)
				inputStream.close();
		}
	}
	
	@Override
	public Entity generateData(int idNumber) {
		Random rand = new Random();				
		
		int pos = rand.nextInt(listLocationName.size());
		String name = listLocationName.get(pos);
		
		pos = rand.nextInt(listNation.size());
		String nation = listNation.get(pos);
			
		pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
			
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + idNumber;
			
		Location lct = new Location(id, name, nation, des, src);
		
		return lct;	
	}
}
