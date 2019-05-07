/**
 *  本棚のスキャンをおこなう。
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	/**
	 * 本棚を保存し、indexを初期値にする。
	 * @param bookShelf 本棚
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/**
	 * 本棚に本があるか確認する
	 */
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 次の本を取り出す。
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
