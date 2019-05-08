/**
 * Adapterの役割もつクラス
 * 用意されたBannerを継承し必要なPrintインターフェースを実装する
 */
public class PrintBanner extends Banner implements Print {
	/**
	 * コンストラクタ
	 * @param string 変換前の文字列
	 */
	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		showWithParen();
	}

	public void printStrong() {
		showWithAster();
	}
}
