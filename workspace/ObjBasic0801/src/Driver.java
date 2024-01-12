/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// 会社名表示
		System.out.println();
		SalesEmployee.displayCompany();

		// 配列要素の初期化（インスタンス化・参照値設定）
		SalesEmployee[] se = {
				new SalesEmployee("速水剛留", 1000000),
				new SalesEmployee("河合彩香"),
				new SalesEmployee("鈴木一郎", 850000),
				new SalesEmployee("佐藤太郎", 1200000)
		};		
/*
		// 配列宣言
 		SalesEmployee[] se = new SalesEmployee[4];

		// インスタンス化・配列要素へ参照値を代入
		se[0] = new SalesEmployee("速水剛留", 1000000);
		se[1] = new SalesEmployee("河合彩香");
		se[2] = new SalesEmployee("鈴木一郎", 850000);
		se[3] = new SalesEmployee("佐藤太郎", 1200000);
*/		
		int total = 0;
		for (int i = 0; i < se.length; i++) {
			System.out.println();
			se[i].displayInfo();		// 配列要素のメソッド呼び出し
			total += se[i].salesAmt;	// 配列要素のフィールド参照
		}

		System.out.println("\n--- 集計値 ---\n");
		System.out.println("【合計】" + total + "円");
		System.out.println("【平均】" + total / se.length + "円");
	}
}
