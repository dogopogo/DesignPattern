
/**
 * 要素の数え上げを行う
 *
 */
public interface Iterator {
	/**
	 * 次の要素が存在するか確認する。
	 * @return 次の要素が存在する場合trueを返す。
	 */
	public abstract boolean hasNext();

	/**
	 * @return 次の要素を一つ返す。
	 */
	public abstract Object next();
}
