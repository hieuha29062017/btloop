package relation;

public class PersonCountryRelation extends Relation {
	private static String[] LIST = {"sinh_ra_tại", "là_quan_chức_của",
									"là_một_công_dân_của", "sinh_sống_tại", "có_chuyến_du_lịch_đến"};
	
	public PersonCountryRelation() {
		NAME_SPACE = "http://PerCtyRelation.oop/";
		LIST_RELATION = LIST;
	}
}
