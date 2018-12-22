package graphdbconnection;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.TreeModel;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;

import entity.*;

public class AddToRepo {
	public static IRI add(Entity ent, RepositoryConnection conn) throws IllegalArgumentException,
	   					UnsupportedOperationException, RepositoryException {
		
		Model model = new TreeModel();
		IRI subject;
		
		if(ent instanceof Person) {
			SpecialType special = AddEntityToModel.addEntityToModel((Person)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		else if(ent instanceof Location) {
			SpecialType special = AddEntityToModel.addEntityToModel((Location)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		else if(ent instanceof Organization) {
			SpecialType special = AddEntityToModel.addEntityToModel((Organization)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		else if(ent instanceof Event) {
			SpecialType special = AddEntityToModel.addEntityToModel((Event)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		else if(ent instanceof Country) {
			SpecialType special = AddEntityToModel.addEntityToModel((Country)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		else if(ent instanceof Time) {
			SpecialType special = AddEntityToModel.addEntityToModel((Time)ent);
			model = special.getModel();
			subject = special.getSubject();
			conn.add(model);
			return subject;
		}
		
		return null;
	}
}
