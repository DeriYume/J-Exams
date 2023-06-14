package uni.fmi.bachelors;

public abstract class APerson {
	private String workID;
	private String name;
	private int experience;
	
	public APerson(String workID, String name, int experience) {
		super();
		this.workID = workID;
		this.name = name;
		this.experience = experience;
	}

	public String getWorkID() {
		return workID;
	}

	public void setWorkID(String workID) {
		this.workID = workID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void printInfo() {
		System.out.println("Work ID: " + workID);
		System.out.println("Name: " + name);
		System.out.println("Exerience: " + experience + " month(s)");
	}
}
