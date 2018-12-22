package entity;

import java.util.Date;

public class Event extends Entity {
	private Date time;
	
	public Event(String id, String name, Date tm, String des, Source src){
		super(id, name, des, src);
		time = tm;
	}
	
	public Date getDate() {
		return time;
	}
}

