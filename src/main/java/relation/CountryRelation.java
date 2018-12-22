package relation;

public class CountryRelation extends Relation {
	private static String[] LIST = {"signAgreementWith", "negotiateWith", "disputesWith",
									"isPartner", "hasCloseRelationsWith"};
	
	public CountryRelation() {
		NAME_SPACE = "http://CountryRelation.oop/";
		LIST_RELATION = LIST;
	}
}
