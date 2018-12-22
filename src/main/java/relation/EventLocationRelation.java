package relation;

public class EventLocationRelation extends Relation {
	private static String[] LIST = {"placeIn"};
	
	public EventLocationRelation() {
		NAME_SPACE = "http://EvtLocRelation.oop/";
		LIST_RELATION = LIST;
	}
}
