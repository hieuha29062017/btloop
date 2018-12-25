package relation;

public class PersonOrganizationRelation extends Relation {
	private static String[] LIST = {"là_thành_viên_của", "là_chủ_tịch_của", "thành_lập",
									"hợp_tác_với", "có_thỏa_thuận_với", 
									"rời_bỏ", "từ_chối_tham_gia",
									"thăm_trụ_sở_của", "là_giám_đốc_của", "là_quản_lý_của"};
	
	public PersonOrganizationRelation() {
		NAME_SPACE = "http://PerOrgRelation.oop/";
		LIST_RELATION = LIST;
	}
}
