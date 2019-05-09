/** 保持した表示すべき文字を<<と>>で囲う*/
public class CharDisplay extends AbstractDisplay {
	private char ch;

	/** 表示すべき文字を保持する*/
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");

	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
