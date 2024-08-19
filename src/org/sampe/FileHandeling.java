package org.sampe;

import java.io.File;
import java.io.IOException;

public class FileHandeling {
	public static void main(String[] args) throws IOException {
		File f = new File("V:\\javaTestFolder\\InsideFolder\\java.txt");
		boolean a = f.createNewFile();
		System.out.println(a);
	}

}
