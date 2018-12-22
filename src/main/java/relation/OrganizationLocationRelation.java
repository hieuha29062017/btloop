package relation;

public class OrganizationLocationRelation extends Relation {
	private static String[] LIST = {"basedIn", "foundedIn"};
	
	public OrganizationLocationRelation() {
		NAME_SPACE = "http://OrgLocRelation.oop/";
		LIST_RELATION = LIST;
	}
}
