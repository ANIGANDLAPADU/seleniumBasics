package partice;

import java.io.File;

public class headless {
	public static void create(String filepath) {
		File file = new File(filepath);
		if (!file.exists()) {
			file.mkdir();
		}
	}

	public static void rename(String filepath, String newpath) {
		File old = new File(filepath);
		File newf = new File(newpath);
		if (old.exists()) {
			old.renameTo(newf);
		}
	}

	public static void delete(String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			for (File f : file.listFiles()) {
				f.delete();
			}
			file.delete();
		}
	}

	public static void main(String[] args) {
		String filepath = "D:\\seshu";
		String newpath = "D:\\babu";
		create(filepath);
		rename(filepath, newpath);
		delete(filepath);

	}
}
