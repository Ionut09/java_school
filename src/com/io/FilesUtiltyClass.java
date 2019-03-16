package com.io;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

import static java.util.stream.Collectors.joining;

public class FilesUtiltyClass {

	public static void main(String[] args) throws IOException {
		File file = new File("fileCreatedWithFile.txt");
		// C:\Users\ionut.spalatelu\Desktop\eclipse-workspace\GitProject\java_school
		Path path = Paths.get("elev_out.txt");
		// createFileWithNIO(path);
		// copyFileOrFolder();
		// deleteFolderAndItsContent(path);
		// writeWithPrintWriter(path);
		// readContentAstring(path);
		fileSeparator(file);

	}

	private static void createFileWithFileClass(File file) throws IOException {
		if (file.createNewFile()) {
			System.out.println("File has been created");
		} else {
			System.out.println("A problem has been encountered!");
		}
	}

	private static void createFileWithIO(File file) throws IOException {
		FileWriter writer = new FileWriter(file, true); // acum adauga la finalul fisierului
		writer.write("\ntext data222222222");
		writer.close();
	}

	private static void createFileWithNIO(Path path) throws IOException {
		String textData = "text data";
		// Files.write(path, textData.getBytes(), StandardOpenOption.CREATE);
		List<String> lines = Arrays.asList(textData, textData, textData);
		Files.write(path, lines, StandardOpenOption.CREATE);
		// StandardCopyOption.REPLACE_EXISTING);
	}

	private static void copyFileOrFolder() throws IOException {
		Path pathSource = Paths.get("file_to_copy.txt");
		Path pathDest = Paths.get("file_copied.txt");

		Files.copy(pathSource, pathDest, REPLACE_EXISTING);
		File srcDir = new File("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace");
		File destDir = new File("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace-copiat");
		FileUtils.copyDirectory(srcDir, destDir);
	}

	// you cannot delete non-empty directories
	private static void deleteFolderAndItsContent(Path path) throws IOException {
		File destDir = new File("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace-copiat");

		if (destDir.delete()) {
			System.out.println("file has been deleted");
		} else {
			System.out.println("file couldn't be deleted");
		}

	}

	private static void writeWithPrintWriter(Path path) throws IOException {
		PrintWriter writer = new PrintWriter(new FileWriter(path.toFile()));
		writer.printf("We learn %s!", "Java"); // %d, %t
		System.out.println(String.format("We learn %s!", "Java"));
		writer.close();
	}

	private static String readContentAstring(Path path) throws IOException {
		// String string = new String(Files.readAllBytes(path), "UTF-8");
		List<String> allLines = Files.readAllLines(path);
		System.out.println(allLines.get(0) + allLines.get(1) + allLines.get(2) + allLines.get(3));
		String collectedString = allLines.stream().collect(joining("\n"));
		System.out.println("\nThe content of the file: " + collectedString);
		return collectedString;
	}

	private static void fileSeparator(File file) throws IOException {
		System.out.println(file.separator);
		System.out.println(file.separatorChar);
		System.out.println(file.pathSeparator);
	}

	private static void channelExample(Path path) throws IOException {
		FileChannel fc = FileChannel.open(path);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		int bytesRead = fc.read(buf);
		while (bytesRead != -1) {
			System.out.println("bytes read: " + bytesRead);
			buf.flip(); // make buffer ready for read
			byte[] dst = new byte[bytesRead];
			buf.get(dst);
			System.out.println(new String(dst, "UTF-8"));
			buf.clear(); // make buffer ready for writing
			bytesRead = fc.read(buf);
		}

	}

	private static void exampleFilevsPath() {
		Path path = Paths
				.get("C:\\Users\\ionut.spalatelu\\Desktop\\eclipse-workspace\\GitProject\\java_school\\in.txt");
		File file = path.toFile();
		file.exists();
		Path path2 = file.toPath();
		if (path.isAbsolute()) {
			System.out.println(path.getFileName());
		}
		// ../../bin/com/oop
		System.out.println(path.getNameCount());
		System.out.println(path.resolveSibling(Paths.get("out.txt")));
		System.out.println(path.getParent().resolve("out.txt"));
	}
}
