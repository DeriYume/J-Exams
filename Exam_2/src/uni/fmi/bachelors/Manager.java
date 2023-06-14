package uni.fmi.bachelors;

public class Manager extends APerson {
	private int workers;
	
	public Manager(String workID, String name, int experience, int workers) {
		super(workID, name, experience);
		this.workers = workers;
	}

	public int getWorkers() {
		return workers;
	}

	public void setWorkers(int workers) {
		this.workers = workers;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("This manager manages " + workers + " people.");
	}
}
