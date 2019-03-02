package com.io;

import java.io.File;
import java.nio.file.*;

public class FilesUtiltyClass {

	public static void main(String[] args) {

		Path path = Paths.get("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace\\GitProject\\java_school\\in.txt");
		File file = path.toFile();
		file.exists();
		Path path2 = file.toPath();
		if (path.isAbsolute()) {
			System.out.println(path.getFileName());
		}
		//  ../../bin/com/oop
		System.out.println(path.getNameCount());
		System.out.println(path.resolveSibling(Paths.get("out.txt")));
		System.out.println(path.getParent().resolve("out.txt"));
		System.setProperty("system.delimiter", "\\");
		
	}
}
