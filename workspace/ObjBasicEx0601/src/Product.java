
public class Product {
	String name;
	int price;
	static int instanceCnt = 0;
	static String STORE_NAME = "速水PC販売店";
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
		instanceCnt++;
	}
	
	static void displayStoreName() {
		System.out.println("店舗名"+STORE_NAME);
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
