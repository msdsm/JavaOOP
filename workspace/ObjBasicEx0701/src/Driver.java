
public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product key = new Product("キーボード", 4000);
		Product mouse = new Product("マウス");
	
		Product.displayStoreName();
		key.display();
		mouse.display();
		
		key.down();
		mouse.up(2000);
		System.out.println("---価格再設定後---");
		key.display();
		mouse.display();
	}

}
