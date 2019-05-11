package idcard;

import java.util.ArrayList;
import java.util.List;

import framwork.Factory;
import framwork.Product;

/** 製品を作る機能と登録を実現する*/
public class IDCardFactory extends Factory {
	private List owners = new ArrayList();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}

	public List getOwners() {
		return owners;
	}

}
