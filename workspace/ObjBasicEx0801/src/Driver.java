
public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product key = new Product("キーボード", 3600);
		Product mouse = new Product("マウス", 2000);
		
		Product.displayStoreName();
		Product[] prods = {
				mouse,
				key,
				new Product("Webカメラ", 3900),
				new Product("マイク", 2800),
				new Product("ディスプレイ", 15000),
				new Product("LED証明", 4200)
		};
		
		for(int i = 0; i < prods.length; i++) {
			prods[i].display();
		}
		System.out.println("\n一斉値下げ後\n");
		for(int i = 0; i < prods.length; i++) {
			prods[i].down();
		}
		for(int i = 0; i < prods.length; i++) {
			prods[i].display();
		}
	}

}
