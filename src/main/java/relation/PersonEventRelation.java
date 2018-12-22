package relation;

public class PersonEventRelation extends Relation {
	private static String[] LIST = {"organized", "canceled", "speakingAt", "agreeToParticipate", "refuseToParticipate",
			                        "isAGuestOf", "performsAt", "playingMusicAt", "singingAt", "isWinnerOf"};
	
	public PersonEventRelation() {
		NAME_SPACE = "http://PerEvtRelation.oop/";
		LIST_RELATION = LIST;
	}
}
