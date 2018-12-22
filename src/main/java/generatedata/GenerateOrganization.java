package generatedata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import entity.Entity;
import entity.Organization;
import entity.Source;

public class GenerateOrganization implements IGenerateData {
	
	private static ArrayList<String> listHeadquarters = new ArrayList<String>();
	private static ArrayList<String> listOrganizationName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
	
	public GenerateOrganization() throws IOException{
		BufferedReader inputStream = null;
		
		try{
			inputStream = new BufferedReader(new FileReader("organizationInfor.txt"));
			
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				listOrganizationName.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-2")){
				listDescription.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-3")){
				Source temp = new Source(vs);
				listSource.add(temp);
			}
			while((vs = inputStream.readLine()) != null && !vs.equals("-4")) {
				listHeadquarters.add(vs);
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

		int pos = rand.nextInt(listOrganizationName.size());
		String name = listOrganizationName.get(pos);
		
		pos = rand.nextInt(listHeadquarters.size());
		String head = listHeadquarters.get(pos);
		
		pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
		
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + idNumber;
		
		Organization organization = new Organization(id, name, head, des, src);
		
		return organization;
	}
}
