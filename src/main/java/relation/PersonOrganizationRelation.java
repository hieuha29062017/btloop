package relation;

public class PersonOrganizationRelation extends Relation {
	private static String[] LIST = {"isMemberOf", "isPresidentOf", "established", "cooperationWith", "hasAnAgreementWith", 
									"leave", "declinedToParticipate", "visitTheHeadquartersOf", "isTheDirectorOf", "isManagerOf"};
	
	public PersonOrganizationRelation() {
		NAME_SPACE = "http://PerOrgRelation.oop/";
		LIST_RELATION = LIST;
	}
}
