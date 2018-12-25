package model;

import org.eclipse.rdf4j.model.BNode;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.impl.TreeModel;

import entity.Country;
import entity.Event;
import entity.Location;
import entity.Organization;
import entity.Person;
import entity.Time;
import relation.RelationOfEntity;

public class AddEntityToModel {
	
	private Model model;
	
	public AddEntityToModel() {
		model = new TreeModel();
	}
	
	public Model getModel(){
		return model;
	}

	public IRI addEntityToModel(Person per) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityPerson.oop/";
		
		IRI subject = vf.createIRI(nameSpace, per.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(per.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(per.getDes()));
		model.add(subject, RelationOfEntity.JOB, vf.createLiteral(per.getJob()));
		model.add(subject, RelationOfEntity.AGE, vf.createLiteral(per.getAge()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(per.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(per.getSource().getDate()));
				
		return subject;
	}
	
	public IRI addEntityToModel(Location lct) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityLocation.oop/";
		
		IRI subject = vf.createIRI(nameSpace, lct.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(lct.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(lct.getDes()));
		model.add(subject, RelationOfEntity.NATIONAL, vf.createLiteral(lct.getNational()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(lct.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(lct.getSource().getDate()));
		
		return subject;
	}
	
	public IRI addEntityToModel(Organization org) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityOrganization.oop/";
		
		IRI subject = vf.createIRI(nameSpace, org.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(org.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(org.getDes()));
		model.add(subject, RelationOfEntity.HEADQUARTERS, vf.createLiteral(org.getHeadquarters()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(org.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(org.getSource().getDate()));
		
		return subject;
	}
	
	public IRI addEntityToModel(Event evt) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityEvent.oop/";
		
		IRI subject = vf.createIRI(nameSpace, evt.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(evt.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(evt.getDes()));
		model.add(subject, RelationOfEntity.HAPPEN_AT_TIME, vf.createLiteral(evt.getDate()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(evt.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(evt.getSource().getDate()));
		
		return subject;
	}
	
	public IRI addEntityToModel(Country cty) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityCountry.oop/";
		
		IRI subject = vf.createIRI(nameSpace, cty.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(cty.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(cty.getDes()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(cty.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(cty.getSource().getDate()));
		
		return subject;
	}
	
	public IRI addEntityToModel(Time time) throws IllegalArgumentException{
		
		ValueFactory vf = SimpleValueFactory.getInstance();
		String nameSpace = "http://EntityTime.oop/";
		
		IRI subject = vf.createIRI(nameSpace, time.getID());
		BNode source = vf.createBNode();
		
		model.add(subject, RelationOfEntity.HAS_NAME, vf.createLiteral(time.getName()));
		model.add(subject, RelationOfEntity.HAS_DESCRIPTION, vf.createLiteral(time.getDes()));
		model.add(subject, RelationOfEntity.HAS_SOURCE, source);
		model.add(source, RelationOfEntity.HAS_LINK, vf.createLiteral(time.getSource().getLink()));
		model.add(source, RelationOfEntity.TIME, vf.createLiteral(time.getSource().getDate()));
		
		return subject;
	}
}
