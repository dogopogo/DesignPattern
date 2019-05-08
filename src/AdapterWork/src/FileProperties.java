import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;;

/**
 * Adapterの役割もつクラス
 * 用意されたPropertiesクラスをインスタンス化し必要なFileIOインターフェースを実装する
 */
public class FileProperties implements FileIO {
	Properties propertis;

	/**
	 * Propertiesをインスタンス化する。
	 */
	public FileProperties() {
		propertis = new Properties();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		File file = new File(filename);
		propertis.load(new FileInputStream(file));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		File file = new File(filename);
		String header = "writtenby" + this.getClass().getName();
		propertis.store(new FileOutputStream(file), header);
	}

	@Override
	public void setValue(String key, String value) {
		propertis.setProperty(key, value);

	}

	@Override
	public String getValue(String key) {
		propertis.getProperty(key);
		return null;
	}

}
