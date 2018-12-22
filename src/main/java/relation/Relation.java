package relation;

import java.util.Random;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class Relation {
	protected static String NAME_SPACE;
	protected static String[] LIST_RELATION;
	
	public IRI getRelation() {
		Random rand = new Random();
		int index = rand.nextInt(LIST_RELATION.length);	
		String relation = LIST_RELATION[index];
		ValueFactory vf = SimpleValueFactory.getInstance();
		
		return vf.createIRI(NAME_SPACE, relation);
	}
}
