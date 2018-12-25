package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;

import entity.Country;
import entity.Event;
import entity.Location;
import entity.Organization;
import entity.Person;
import entity.Time;
import generatedata.GenerateCountry;
import generatedata.GenerateEvent;
import generatedata.GenerateLocation;
import generatedata.GenerateOrganization;
import generatedata.GeneratePerson;
import generatedata.GenerateTime;
import relation.CountryRelation;
import relation.EventLocationRelation;
import relation.EventTimeRelation;
import relation.OrganizationEventRelation;
import relation.OrganizationLocationRelation;
import relation.PersonCountryRelation;
import relation.PersonEventRelation;
import relation.PersonOrganizationRelation;
import relation.PersonRelation;
import relation.Relation;
import relation.TimePersonRelation;

public class AddToRepository {
	
	private static ArrayList<IRI> ListPersonID;
	private static ArrayList<IRI> ListLocationID;
	private static ArrayList<IRI> ListOrganizationID;
	private static ArrayList<IRI> ListEventID;
	private static ArrayList<IRI> ListCountryID;
	private static ArrayList<IRI> ListTimeID; 
	private static GeneratePerson person;
	private static GenerateLocation location;
	private static GenerateCountry country;
	private static GenerateEvent event;
	private static GenerateTime time;
	private static GenerateOrganization organization;
	
	public AddToRepository() throws IOException{
		ListCountryID = new ArrayList<IRI>();
		ListEventID = new ArrayList<IRI>();
		ListLocationID = new ArrayList<IRI>();
		ListOrganizationID = new ArrayList<IRI>();
		ListPersonID = new ArrayList<IRI>();
		ListTimeID = new ArrayList<IRI>();
		person = new GeneratePerson();
		location = new GenerateLocation();
		country = new GenerateCountry();
		event = new GenerateEvent();
		time = new GenerateTime();
		organization = new GenerateOrganization();
	}
	
	private Model createModelForEntity(int size) {
		AddEntityToModel add = new AddEntityToModel();
		Random rand = new Random();
		
		for(int i=0; i< size; i++) {
			int type = rand.nextInt(6);
			if(type == 0) {
				Person per = person.generateData(i);
				ListPersonID.add(add.addEntityToModel(per));
			}
			else if(type == 1) {
				Location lct = location.generateData(i);
				ListLocationID.add(add.addEntityToModel(lct));   
			}
			else if(type == 2) {
				Organization org = organization.generateData(i);
				ListOrganizationID.add(add.addEntityToModel(org));
			}
			else if(type == 3) {
				Country cty = country.generateData(i);
				ListCountryID.add(add.addEntityToModel(cty));
			}
			else if(type == 4){
				Time tim = time.generateData(i);
				ListTimeID.add(add.addEntityToModel(tim));
			}
			else {
				Event evt = event.generateData(i);
				ListEventID.add(add.addEntityToModel(evt));
			}
		}
		return add.getModel();
	}
	
	private Model createModelForRelation(int numberRelation)throws IllegalArgumentException {
		AddRelationToModel add = new AddRelationToModel();
		
		Random rand = new Random();
		int sizeOfListCountry = ListCountryID.size();
		int sizeOfListEvent = ListEventID.size();
		int sizeOfListLocation = ListLocationID.size();
		int sizeOfListOrganization = ListOrganizationID.size();
		int sizeOfListPerson = ListPersonID.size();
		int sizeOfListTime = ListTimeID.size();
		
		for(int i=0; i<numberRelation; i++) {
			int typeOfRelation = rand.nextInt(10);
			if(typeOfRelation == 0) {
				Relation rela = new CountryRelation();
				IRI relation = rela.getRelation();
				
				int index1 = rand.nextInt(sizeOfListCountry);
				int index2;
				do {
					index2 = rand.nextInt(sizeOfListCountry);
				}while(index2 == index1);
				
				IRI subj1 = ListCountryID.get(index1);
				IRI subj2 = ListCountryID.get(index2);
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 1) {
				Relation rela = new EventLocationRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListEventID.get(rand.nextInt(sizeOfListEvent));
				IRI subj2 = ListLocationID.get(rand.nextInt(sizeOfListLocation));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 2) {
				Relation rela = new EventTimeRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListEventID.get(rand.nextInt(sizeOfListEvent));
				IRI subj2 = ListTimeID.get(rand.nextInt(sizeOfListTime));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 3) {
				Relation rela = new OrganizationEventRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListOrganizationID.get(rand.nextInt(sizeOfListOrganization));
				IRI subj2 = ListEventID.get(rand.nextInt(sizeOfListEvent));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 4) {
				Relation rela = new OrganizationLocationRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListOrganizationID.get(rand.nextInt(sizeOfListOrganization));
				IRI subj2 = ListLocationID.get(rand.nextInt(sizeOfListLocation));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 5) {
				Relation rela = new PersonCountryRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListPersonID.get(rand.nextInt(sizeOfListPerson));
				IRI subj2 = ListCountryID.get(rand.nextInt(sizeOfListCountry));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 6) {
				Relation rela = new PersonEventRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListPersonID.get(rand.nextInt(sizeOfListPerson));
				IRI subj2 = ListEventID.get(rand.nextInt(sizeOfListEvent));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 7) {
				Relation rela = new PersonOrganizationRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListPersonID.get(rand.nextInt(sizeOfListPerson));
				IRI subj2 = ListOrganizationID.get(rand.nextInt(sizeOfListOrganization));
				add.addRelationToModel(subj1, relation, subj2);
			}
			else if(typeOfRelation == 8) {
				Relation rela = new PersonRelation();
				IRI relation = rela.getRelation();
				
				int index1 = rand.nextInt(sizeOfListPerson);
				int index2;
				do {
					index2 = rand.nextInt(sizeOfListPerson);
				}while(index2 == index1);
				
				IRI subj1 = ListPersonID.get(index1);
				IRI subj2 = ListPersonID.get(index2);
				add.addRelationToModel(subj1, relation, subj2);
			}
			else{
				Relation rela = new TimePersonRelation();
				IRI relation = rela.getRelation();
				IRI subj1 = ListTimeID.get(rand.nextInt(sizeOfListTime));
				IRI subj2 = ListPersonID.get(rand.nextInt(sizeOfListPerson));
				add.addRelationToModel(subj1, relation, subj2);
			}	
		}
		
		return add.getModel();
	}
	
	public void pushEntity(int numberEntity, int sizeOfSegment, RepositoryConnection conn) throws RepositoryException {

		int surplus = numberEntity%sizeOfSegment;
		int loop = numberEntity/sizeOfSegment;
		System.out.println("Adding entities to repository...");
		for(int i=0; i<loop; i++) {
			conn.add(createModelForEntity(sizeOfSegment));
		}
		conn.add(createModelForEntity(surplus));
		System.out.println("Successful !");
	}
	
	public void pushRelation(int numberRelation, int sizeOfSegment, RepositoryConnection conn) throws RepositoryException{
		
		int surplus = numberRelation%sizeOfSegment;
		int loop = numberRelation/sizeOfSegment;
		System.out.println("Adding relation to repository!!");
		for(int i=0; i<loop; i++) {
			conn.add(createModelForRelation(sizeOfSegment));
		}
		conn.add(createModelForRelation(surplus));
		System.out.println("Successful !");
	}
}
