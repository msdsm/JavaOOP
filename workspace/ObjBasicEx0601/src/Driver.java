
public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product prod = new Product("キーボード", 3000);
		Product prod2 = new Product("マウス", 2000);
	
		Product.displayStoreName();
		prod.display();
		prod2.display();
		System.out.println("インスタンス数 : " + Product.instanceCnt);
	}

}
