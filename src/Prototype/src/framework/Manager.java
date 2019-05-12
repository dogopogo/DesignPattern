package framework;

import java.util.HashMap;

/** createCloneを使ってインスタンスを複製するクラス */
public class Manager {
	private HashMap showcase = new HashMap();

	/**
	 * @param name
	 * @param proto
	 */
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	/**
	 * @param protoname
	 * @return Product
	 */
	public Product create(String protoname) {
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
