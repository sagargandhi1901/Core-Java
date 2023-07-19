package Day17.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\sagandhi\\Desktop\\Practice\\CoreJava\\src\\Day17\\FileIO\\info.txt", true);
		fw.write(73);
		fw.write("\n");
		fw.write("Sagar Gandhi");
		fw.write("\n");
		fw.write(new char[]{'a', 'b', 'c'});
		
		fw.flush();
		fw.close();
		
		System.out.println("********************");
		
		FileReader fr = new FileReader("C:\\Users\\sagandhi\\Desktop\\Practice\\CoreJava\\src\\Day17\\FileIO\\info.txt");
//		int read = fr.read();
//		System.out.println(read);
		
		int i = fr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}