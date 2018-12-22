package relation;

public class OrganizationEventRelation extends Relation {
	private static String[] LIST = {"organized", "canceled", "announcedAt", "isWinnerAt", "refused"};
	
	public OrganizationEventRelation() {
		NAME_SPACE = "http://OrgEvtRelation.oop/";
		LIST_RELATION = LIST;
	}
}
