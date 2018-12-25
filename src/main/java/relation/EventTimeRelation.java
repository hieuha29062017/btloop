package relation;

public class EventTimeRelation extends Relation {
	private static String[] LIST = {"bắt_đầu_vào_lúc", "kết_thúc_lúc", "diễn_ra_lúc"};
	
	public EventTimeRelation() {
		NAME_SPACE = "http://EvtTimeRelation.oop/";
		LIST_RELATION = LIST;
	}
}
