package relation;

public class EventTimeRelation extends Relation {
	private static String[] LIST = {"startOn", "endOn", "takePlaceOn"};
	
	public EventTimeRelation() {
		NAME_SPACE = "http://EvtTimeRelation.oop/";
		LIST_RELATION = LIST;
	}
}
