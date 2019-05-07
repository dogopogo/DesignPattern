import java.util.ArrayList;
import java.util.List;

/**
 * 本棚を表す
 */
public class BookShelf implements Aggregate {
	private List<Book> books;
	private int last = 0;

	/**
	 * @param maxsize 本棚に格納できる本の最大数
	 */
	public BookShelf(int maxsize) {
		this.books = new ArrayList<Book>();
	}

	/**
	 * indexに対応した本を返す。
	 * @param index 本の場所
	 * @return indexに対応した本
	 */
	public Book getBookAt(int index) {
		return books.get(index);
	}

	/**
	 * 本を本棚の最後に格納する。
	 * @param book 本
	 */
	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	/**
	 * 本棚に格納されている本の数を返す。
	 * @return 本の数
	 */
	public int getLength() {
		return last;
	}

	/**
	 * 本棚に対応したIteratorを返す。
	 * @return 本棚に対応したIterator
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
