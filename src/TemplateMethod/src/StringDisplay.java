/**文字列を記号で囲う*/
public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;

	/**保持したい文字列とバイトの幅を保存する*/
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	/** +--+を文字列として表示する*/
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
