package Day17.FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("abcdemo.txt"));
		bw.write(100);
		bw.newLine();
		bw.write("Sagar");
		bw.newLine();
		bw.newLine();
		bw.write("Gandhi");
		
		bw.flush();
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("abcdemo.txt"));
		String line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}
