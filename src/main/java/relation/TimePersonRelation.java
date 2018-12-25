package relation;

public class TimePersonRelation extends Relation {
	private static String[] LIST = {"là_ngày_sinh_của", "là_ngày_cưới_của",
									"là_ngày_tốt_nghiệp_của"};
	
	public TimePersonRelation() {
		NAME_SPACE = "http://TimePerRelation.oop/";
		LIST_RELATION = LIST;
	}
}
