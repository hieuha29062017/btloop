package generatedata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import entity.Source;
import entity.Time;

public class GenerateTime implements IGenerateData<Time> {
	
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
	
	public GenerateTime() throws IOException{
		BufferedReader inputStream = null;
	
		try{
			inputStream = new BufferedReader(new FileReader("timeInfor.txt"));
				
			String vs;	
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				vs = vs.trim();
				listDescription.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-2")){
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

	public Time generateData(int idNumber) {
		Random rand = new Random();	
		
		GregorianCalendar gc = new GregorianCalendar();      
		int year = 2010 + (int)Math.round(Math.random() *(2018 - 2010));
		gc.set(GregorianCalendar.YEAR, year);
		int dayOfYear = 1 + (int)Math.round(Math.random() * (gc.getActualMaximum(GregorianCalendar.DAY_OF_YEAR) - 1));
		gc.set(GregorianCalendar.DAY_OF_YEAR, dayOfYear);       
		Date date = gc.getTime();
		String vs = date.toString();
		String name = vs.substring(4, 11) + vs.substring(24);
			
		int pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
			
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + idNumber;
			
		Time time = new Time(id, name, des, src);
		
		return time;	
	}
}
