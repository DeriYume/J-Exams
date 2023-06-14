package uni.fmi.bachelors;

public class Programmer extends APerson {
	boolean knowsJava, knowsCS;

	public Programmer(String workID, String name, int experience, boolean knowsJava, boolean knowsCS) {
		super(workID, name, experience);
		this.knowsJava = knowsJava;
		this.knowsCS = knowsCS;
	}

	public boolean isKnowsJava() {
		return knowsJava;
	}

	public void setKnowsJava(boolean knowsJava) {
		this.knowsJava = knowsJava;
	}

	public boolean isKnowsCS() {
		return knowsCS;
	}

	public void setKnowsCS(boolean knowsCS) {
		this.knowsCS = knowsCS;
	}
	
	public void printInfo() {
		super.printInfo();
		if (knowsJava) System.out.println("They know Java");
		if (knowsCS) System.out.println("They know C#");
	}
}
