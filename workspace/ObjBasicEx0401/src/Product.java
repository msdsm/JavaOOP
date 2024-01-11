
public class Product {
	String name;
	int price;
	
	int up(int amt) {
		price -= amt;
		return price;
	}
	
	int down(int amt)
	{
		price -= amt;
		return price;
	}	
	
	void display() {
		System.out.println(name + ":" + price + "円");
	}
}
