package graphdbconnection;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;

public class SpecialType {
	private Model model;
	private IRI subject;
	
	public SpecialType(Model mdl, IRI subj) {
		model = mdl;
		subject = subj;
	}
	
	public Model getModel() {
		return model;
	}
	
	public IRI getSubject() {
		return subject;
	}
}
