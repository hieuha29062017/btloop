package entity;

public class Organization extends Entity {
	private String headquarters;
	
	public Organization(String id, String name, String head, String des, Source src){
		super(id, name, des, src);
		headquarters = head;
	}
	
	public String getHeadquarters() {
		return headquarters;
	}
}
