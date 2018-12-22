package relation;

public class TimePersonRelation extends Relation {
	private static String[] LIST = {"isBirthdayOf", "isTheWeddingDayOf", "isTheGraduationDayOf",
									"isLuckyDayOf"};
	
	public TimePersonRelation() {
		NAME_SPACE = "http://TimePerRelation.oop/";
		LIST_RELATION = LIST;
	}
}
