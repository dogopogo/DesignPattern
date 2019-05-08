
/**
 * Adapterの役割もつクラス
 * 用意されたBannerをインスタンスに持ち、必要なPrint継承する。
 */
public class PrintBannerClass extends PrintClass {
	private Banner banner;

	/**
	 * 用意されたBannerをインスタンス化しフィールドに格納する。
	 * @param string
	 */
	public PrintBannerClass(String string) {
		this.banner = new Banner(string);
	}

	/**
	 * 委譲して弱く表示する
	 */
	public void printWeak() {
		banner.showWithParen();

	}

	/**
	 * 委譲して強く表示する
	 */
	public void printStrong() {
		banner.showWithAster();
	}
}
