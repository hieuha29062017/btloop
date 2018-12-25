package relation;

public class OrganizationLocationRelation extends Relation {
	private static String[] LIST = {"có_trụ_sở_tại", "thành_lập_tại", "tham_gia_sự_kiện_tại"};
	
	public OrganizationLocationRelation() {
		NAME_SPACE = "http://OrgLocRelation.oop/";
		LIST_RELATION = LIST;
	}
}
