package Day17.FileIO;

import java.io.File;
import java.io.IOException;

public class FileIODemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\sagandhi\\Desktop\\Practice\\CoreJava\\src\\Day17\\FileIO\\abc.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
		File file2 = new File("C:\\Users\\sagandhi\\Desktop\\Practice\\CoreJava\\src\\Day17\\FileIO", "abc2.txt");
		file2.createNewFile();
		System.out.println(file2.exists());
		
		File file4 = new File("C:\\Users\\sagandhi\\Desktop\\Practice\\CoreJava\\src\\Day17\\FileIO\\temp");
		file4.mkdir();
		System.out.println(file4.exists());
		
		File file3 = new File(file4, "abc3.txt");
		file3.createNewFile();
		System.out.println(file3.exists());
		
		// wap to display all the files and directories in D drive
		File f1 = new File("C:\\");
		int count = 0;
		String[] listOfFiles = f1.list();
		for (String f : listOfFiles) {
			count++;
			System.out.println(f);
		}
		System.out.println("number of files and folders: " + count);
		
		// wap to display all the filesnames only and directories in D drive
		File f2 = new File("C:\\");
		int count2 = 0;
		String[] listOfFiles2 = f1.list();
		for (String fileInfo : listOfFiles2) {
			File tempFile = new File(f2, fileInfo);
			if (tempFile.isFile()) {
				count2++;
				System.out.println(fileInfo);
			}
		}
		System.out.println("number of files : " + count2);
	}
}