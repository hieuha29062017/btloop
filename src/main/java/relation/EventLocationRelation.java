package relation;

public class EventLocationRelation extends Relation {
	private static String[] LIST = {"được_tổ_chức_tại"};
	
	public EventLocationRelation() {
		NAME_SPACE = "http://EvtLocRelation.oop/";
		LIST_RELATION = LIST;
	}
}
