package framwork;

/** 製品を作り登録する*/
public abstract class Factory {
	/** 製品作成と登録*/
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String string);

	protected abstract void registerProduct(Product product);
}
