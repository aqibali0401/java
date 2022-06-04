package encapsulation;

public class Encapsulation {
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(555); 
		
		System.out.println(l1.getPrice());
	}
	
//	void doWork() {
//		System.out.println("working working");
//	}
	
}

class Laptop{
	int ram;
	private int price;
	public void setPrice(int price) {
		// validation -> is a user is admin
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
}
