/**
 * あらかじめ提供されているクラス
 */
public class Banner {
	private String string;

	/**
	 * @param string 変換前の文字列
	 */
	public Banner(String string) {
		this.string = string;
	}

	/**
	 * 変換前の文字列から括弧つきの弱い文字列を表示する。
	 */
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	/**
	 * 変換前の文字列から*つきの強い文字列を表示する。
	 */
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
