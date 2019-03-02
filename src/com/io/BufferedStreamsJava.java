package com.io;

import java.io.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Test;

public class BufferedStreamsJava {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
			String line = null;
			reader.mark(5);
			while ((line = reader.readLine()) != null) {
				if (reader.markSupported()) {
					if (line.equalsIgnoreCase("the content of the input file2")) {
						reader.reset();
						System.out.println("The character stream has been reseted!");
					}
				}
				System.out.println(line);
				if(line.equals("the content of the input file2")) {
					break;
				}
			}
		} catch (IOException ex) {
			System.out.println("I can't find the file, where it is????");
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"))){
			Stream<String> streamOfLines = reader.lines();
			//void accept(String line);
			streamOfLines.forEach(line -> {
											System.out.println("With lines: --> " + line);
											return;
											});
			
			
//			streamOfLines.forEach(new Consumer<String>() {
//				@Override
//				public void accept(String line) {
//					System.out.println("With lines: --> " + line);
//				}
//			});
//		
		//String metodaDin(int a);
		InterfataFunctionala lambda = (int ANA) -> {//fac o gramada de chestii
													//inca o gramada
														return "un String";};
		System.out.println(lambda.metodaDinInterfata(10));
		
		}catch (IOException e) {
			System.out.println("I can't find the file, where it is????");
		}

	}
}
