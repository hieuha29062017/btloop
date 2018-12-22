package relation;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;

public class RelationOfEntity {
	public static final String NAME_SPACE = "http://RelationOfEntity.oop/";
	public static final IRI HAS_NAME = getIRI("hasName");
	public static final IRI HAS_DESCRIPTION = getIRI("hasDescription");
	public static final IRI HAS_SOURCE = getIRI("hasSource");
	public static final IRI HAS_LINK = getIRI("hasLink");
	public static final IRI TIME = getIRI("updateAtTime");
	public static final IRI JOB = getIRI("hasJob");
	public static final IRI AGE = getIRI("hasAge");
	public static final IRI HEADQUARTERS = getIRI("hasHeadQuarters");
	public static final IRI NATIONAL = getIRI("isACityOf");
	public static final IRI HAPPEN_AT_TIME = getIRI("happenAtTime");
	
	private static IRI getIRI(String localName) {
		return SimpleValueFactory.getInstance().createIRI(NAME_SPACE, localName);
	}
}
