package partice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty ("user.dir")+ "\\testdata\\file.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();

	}

}
