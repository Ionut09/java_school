package com.recapitulation;

public class OCA {
	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("12345678"); 
		 sb.setLength(5);     
		 sb.setLength(10);
		 System.out.println(sb);
		 System.out.println(sb.length());//de tinut minte
		// StringBuffer a = makeList("");
	}
	
	public static <T> T makeList(T t) {
		return t;
	}
}
