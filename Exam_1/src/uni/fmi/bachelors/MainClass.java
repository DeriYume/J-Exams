package uni.fmi.bachelors;

public class MainClass {

	public static void main(String[] args) {
		Stock stock1 = new Stock("Waffle", "17-03-2023", 3.49);
		Stock stock2 = new Stock("Biscuit", "14-05-2002", 6.99);
		Stock stock3 = new Stock("Ice cream", "29-02-2024", 4.33);
		
		stock1.printInfo();
		stock2.printInfo();
		stock3.printInfo();
	}

}
