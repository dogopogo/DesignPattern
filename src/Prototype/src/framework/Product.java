package framework;

/** 抽象メソッドuseとcreateCloneが宣言されているインタフェース */
public interface Product extends Cloneable {
	/**
	 * @param s
	 */
	public abstract void use(String s);

	/**
	 * @return Product
	 */
	public abstract Product createClone();
}
