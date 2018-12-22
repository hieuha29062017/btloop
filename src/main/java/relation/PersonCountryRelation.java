package relation;

public class PersonCountryRelation extends Relation {
	private static String[] LIST = {"wasBornAt", "isPresidentOf",
									"isACitizenOf", "livingIn"};
	
	public PersonCountryRelation() {
		NAME_SPACE = "http://PerCtyRelation.oop/";
		LIST_RELATION = LIST;
	}
}
