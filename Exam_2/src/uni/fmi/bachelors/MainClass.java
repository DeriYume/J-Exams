package uni.fmi.bachelors;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Programmer p1 = new Programmer ("12345", "John", 12, true, true);
		Programmer p2 = new Programmer ("67890", "George", 6, true, false);
		Programmer p3 = new Programmer ("13579", "Michael", 24, false, true);
		
		Manager m1 = new Manager ("24680", "Anna", 33, 28);
		Manager m2 = new Manager ("12095", "Lisa", 12, 5);
		Manager m3 = new Manager ("33886", "Johnny", 5, 10);
		Manager m4 = new Manager ("55337", "Alejandro", 27, 50);
		
		ArrayList<APerson> arrList = new ArrayList<>();
		arrList.add(p1); arrList.add(p2); arrList.add(p3);
		arrList.add(m1); arrList.add(m2); arrList.add(m3); arrList.add(m4);
		
		int programmerCount = 0;
		int managerCount = 0;
		int sumWorker = 0;
		
		for (int i = 0 ; i < arrList.size() ; i++) {
			if (arrList.get(i) instanceof Programmer) { programmerCount++; }
			if (arrList.get(i) instanceof Manager) { 
				managerCount++;
				sumWorker += ((Manager)arrList.get(i)).getWorkers();
				}
		}
		System.out.println("===Task 1===Programmers & Managers===");
		System.out.println("Programmers: " + programmerCount);
		System.out.println("Managers:  " + managerCount);
		System.out.println("===Task 2===AVG Workers/Manager===");
		System.out.println("The AVG is: " + sumWorker/managerCount);
	}
}
