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
		// インスタンス化・情報表示
		SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
		System.out.println();
		hayami.displayInfo();

		// 売上・情報表示
		hayami.sell(300000);		// 引数 30 万円
		System.out.println();
		hayami.displayInfo();

		// 標準売上金額で売上・情報表示
		hayami.sell();				// 引数なし
		System.out.println();
		hayami.displayInfo();
	}
}
