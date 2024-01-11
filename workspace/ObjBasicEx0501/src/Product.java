
public class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	int up(int amt) {
		price += amt;
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
