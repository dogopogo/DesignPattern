/**
 * 抽象クラス
 */
public abstract class AbstractDisplay {
	/** サブクラスに実装を任せる*/
	public abstract void open();

	/** サブクラスに実装を任せる*/
	public abstract void print();

	/** サブクラスに実装を任せる*/
	public abstract void close();

	/**
	 * printを５回実行する
	 */
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}

}
