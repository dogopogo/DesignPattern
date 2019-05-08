import java.io.IOException;

/**
 * 必要とされるクラス
 */
public interface FileIO {
	/** ファイルを読み込む*/
	public void readFromFile(String filename) throws IOException;

	/** ファイルに書き込む*/
	public void writeToFile(String filename) throws IOException;

	/** 値を書き込む*/
	public void setValue(String key, String Value);

	/** キーに対応した値を得る*/
	public String getValue(String key);
}
