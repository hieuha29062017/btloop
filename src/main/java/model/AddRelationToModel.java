package model;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.TreeModel;

public class AddRelationToModel {
	
	private Model model;
	
	public AddRelationToModel() {
		model = new TreeModel();
	}
	
	public Model getModel() {
		return model;
	}
	
	public void addRelationToModel(IRI subject, IRI predicate, IRI object) throws IllegalArgumentException{

		model.add(subject, predicate, object);
	}
}
