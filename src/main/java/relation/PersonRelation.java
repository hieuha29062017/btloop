package relation;

public class PersonRelation extends Relation {
	private static String[] LIST = {"isBrotherOf", "hasChild", "isBossOf", "isFriendOf", "goOutWith",
									"isCloseFriendOf", "isPartnerOf", "isDoctorOf", "playGameWith", "fallingInLoveWith"};
	
	public PersonRelation() {
		NAME_SPACE = "http://PersonRelation.oop/";
		LIST_RELATION = LIST;
	}
}
