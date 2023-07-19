package Day17.FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("player.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.println('D');
		pw.println(7);
		pw.println();
		pw.println("Dhoni");
		
		pw.flush();
		pw.close();
	}
}