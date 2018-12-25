package relation;

public class OrganizationEventRelation extends Relation {
	private static String[] LIST = {"tổ_chức", "hủy_bỏ", "tuyên_bố_tại", "giành_chiến_thắng_tại",
									"từ_chối_tham_gia"};
	
	public OrganizationEventRelation() {
		NAME_SPACE = "http://OrgEvtRelation.oop/";
		LIST_RELATION = LIST;
	}
}
