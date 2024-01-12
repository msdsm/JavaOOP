# セクション7:オーバーロード


## 自分用メモ

### オーバーロード
- 同一クラスの中に同じ名前のメソッドやコンストラクタを複数定義すること
- シグネチャが異なれば良い

### シグネチャ
- メソッドを特定するための情報
    - メソッド名
    - 引数のデータ型
    - 引数の個数
    - 引数の順番
    - など


### this()
- 同一クラスの別コンストラクタを呼び出せる
- 注意点:コンストラクタの先頭で記述する必要がある
- 以下、this()をつかわない使用例
```java
public class SalesEmployee{
    String name;
    int salesAmt;
    SalesEmployee(String name, int salesAmt){
        this.name = name;
        this.salesAmt = salesAmt;
    }
    SalesEmployee(String name){
        this.name = name;
        this.salesAmt = 0;
    }
}
```

- 以下、this()を使った例
```java
public class SalesEmployee{
    String name;
    int salesAmt;
    SalesEmployee(String name, int salesAmt){
        this.name = name;
        this.salesAmt = salesAmt;
    }
    SalesEmployee(String name){
       this(name, 0);
    }
}
```
- 変更点が生じたことを考えると、処理は一箇所に集約したほうが良いためthis()使うべき