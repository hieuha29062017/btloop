package entity;

public class Location extends Entity {
	private String nation;
	
	public Location(String id, String name, String country, String des, Source src){
		super(id, name, des, src);
		nation = country;
	}
	
	public String getNational() {
		return nation;
	}	
}
