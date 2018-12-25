package relation;

public class PersonEventRelation extends Relation {
	private static String[] LIST = {"tổ_chức", "hủy_bỏ", "phát_biểu_tại", "đồng_ý_tham_gia",
									"từ_chối_tham_gia",
			                        "là_khách_mời_của", "biểu_diễn_tại", "chiến_thắng_tại"};
	
	public PersonEventRelation() {
		NAME_SPACE = "http://PerEvtRelation.oop/";
		LIST_RELATION = LIST;
	}
}
