/** メインクラス*/
public class Main {
	/** Helloで強く表示、弱く表示*/
	public static void main(String[] args) {
		Print print = new PrintBanner("継承で実装した場合");
		print.printStrong();
		print.printWeak();
		PrintClass printClass = new PrintBannerClass("委譲で実装した場合");
		printClass.printStrong();
		printClass.printWeak();
	}

}
