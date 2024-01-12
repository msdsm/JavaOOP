# セクション8:参照型の配列
## 自分用メモ

### クラス型の配列初期化
```java
SalesEmployee[] se = {
    new SalesEmployee("abc", 10);
    new SalesEmployee("xyz", 100);
    new SalesEmployee("aa", 1000);
}
```
- 以下の場合は3つインスタンス化されたときにデフォルトコンストラクタ呼び出されそう
```java
SalesEmployee[] se = new SalesEmployee[3];
```