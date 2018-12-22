package entity;

public class Person extends Entity {
	private String personJob;
	private int age;
	
	public Person(String id, String name, String job, int age, String des, Source src){
		super(id, name, des, src);
		personJob = job;
		this.age = age;
	}
	
	public String getJob() {
		return personJob;
	}
	
	public int getAge() {
		return age;
	}
}
