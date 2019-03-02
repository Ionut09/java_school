package com.io;

import java.io.*;
import java.util.stream.*;

public class BuffereReaderLinesStreamExample {

	public static void main(String[] args){
		try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true))) {
		
			Stream<String> streamOfLines = reader.lines();
			streamOfLines
					.peek(line -> {
						try {
							writer.write(line);
							writer.newLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
					})
					.forEach(line -> {
											System.out.println("With lines: --> " + line);
											return;
											});
			
		}catch (IOException e) {
			System.out.println("I can't find the file, where it is????");
		}

	}
}
