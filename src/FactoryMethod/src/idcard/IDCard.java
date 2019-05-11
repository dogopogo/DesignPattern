package idcard;

import framwork.Product;

/** 認識番号カードを示す */
public class IDCard extends Product {
	/** 名前 */
	private String owner;

	IDCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "のカードを使います。");

	}

	public String getOwner() {
		return owner;
	}
}
