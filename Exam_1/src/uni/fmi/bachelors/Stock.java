package uni.fmi.bachelors;

public class Stock {
	private String name;
	private String expDate;
	private double price;
	
	public Stock(String name, String expDate, double price) {
		this.name = name;
		this.expDate = expDate;
		this.price = price;
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public String getExpDate() {return expDate;}

	public void setExpDate(String expDate) {this.expDate = expDate;}

	public double getPrice() {return price;}

	public void setPrice(double price) { this.price = price; }
	
	public void printInfo()
	{
		System.out.println("Info about the stock: ");
		System.out.println("Name: " + name + "\nExpiration: " + expDate + "\nAverage Price:");
		System.out.println("");
	}
}