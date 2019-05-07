
/**
 * 本を表す
 *
 */
public class Book {

	private String name;

	/**
	 * @param name 本の名前
	 */
	public Book(String name) {
		this.name = name;
	}

	/**
	 * 本の名前を返す。
	 * @return 本の名前
	 */
	public String getName() {
		return name;
	}
}
