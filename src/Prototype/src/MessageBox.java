import framework.Product;

/** 文字列を枠線で囲って表示するクラス */
public class MessageBox implements Product {
	private char decochar;

	/**
	 * @param decochar 装飾文字
	 */
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
