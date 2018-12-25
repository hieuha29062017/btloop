package relation;

public class PersonRelation extends Relation {
	private static String[] LIST = {"là_anh_trai_của", "có_con_là", "là_sếp_của",
									"là_bạn_của", "gặp_gỡ",
									"là_bạn_thân_của", "là_cộng_tác_viên_của",
									"là_bác_sĩ_của", "đang_yêu"};
	
	public PersonRelation() {
		NAME_SPACE = "http://PersonRelation.oop/";
		LIST_RELATION = LIST;
	}
}
