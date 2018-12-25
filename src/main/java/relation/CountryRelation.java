package relation;

public class CountryRelation extends Relation {
	private static String[] LIST = {"kí_thỏa_thuận_với", "đàm_phán_với", "có_tranh_chấp_với",
									"là_đối_tác_của", "có_quan_hệ_thân_thiết_với"};
	
	public CountryRelation() {
		NAME_SPACE = "http://CountryRelation.oop/";
		LIST_RELATION = LIST;
	}
}
