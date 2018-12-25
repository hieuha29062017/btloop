package generatedata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import entity.Person;
import entity.Source;

public class GeneratePerson implements IGenerateData <Person> {
	
	private static ArrayList<String> listPersonName = new ArrayList<String>();
	private static ArrayList<String> listJobName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
	
	public GeneratePerson() throws IOException{
		BufferedReader inputStream = null;
		
		try{
			inputStream = new BufferedReader(new FileReader("personInfor.txt"));
			
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				vs = vs.trim();
				listPersonName.add(vs);
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
			while((vs = inputStream.readLine()) != null && !vs.equals("-4")) {
				vs = vs.trim();
				listJobName.add(vs);			
			}
		}
		finally{
			if(inputStream != null)
				inputStream.close();
		}
	}
	
	public Person generateData(int idNumber) {
		Random rand = new Random();	

		int pos = rand.nextInt(listPersonName.size());
		String name = listPersonName.get(pos);
		
		int age = rand.nextInt(90);
		
		pos = rand.nextInt(listJobName.size());
		String job = listJobName.get(pos);
		
		pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
		
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + idNumber;		
		
		Person person = new Person(id, name, job, age, des, src);
		
		return person;
	}
}
