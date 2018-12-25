package generatedata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import entity.Country;
import entity.Source;

public class GenerateCountry implements IGenerateData<Country> {
	
	private static ArrayList<String> listCountryName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
	public GenerateCountry() throws IOException{
		BufferedReader inputStream = null;
	
		try{
			inputStream = new BufferedReader(new FileReader("countryInfor.txt"));
				
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				vs = vs.trim();
				listCountryName.add(vs);
			}
				
			while((vs = inputStream.readLine()) != null && !vs.equals("-2")){
				vs = vs.trim();
				listDescription.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-3")){
				vs = vs.trim();
				Source temp = new Source(vs);
				listSource.add(temp);
			}
		}
		finally{
			if(inputStream != null)
				inputStream.close();
		}
	}
	public Country generateData(int idNumber) {
		Random rand = new Random();				
		
		int pos = rand.nextInt(listCountryName.size());
		String name = listCountryName.get(pos);
			
		pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
			
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + idNumber;
			
		Country ct = new Country(id, name, des, src);
		
		return ct;		
	}
}
