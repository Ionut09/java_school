package com.exercises;

import static java.util.Comparator.comparing;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Comparator<IndexUrlVO> comparator = comparing(IndexUrlVO::getAccesedTimes).reversed();
		TreeSet<IndexUrlVO> set = new TreeSet<>(comparator);
		set.add(new IndexUrlVO(1, "dede"));
		set.add(new IndexUrlVO(3, "hhhh"));
		set.add(new IndexUrlVO(4, "tttt"));
		set.add(new IndexUrlVO(5, "rrrr"));
		set.add(new IndexUrlVO(2, "eeee"));

		System.out.println("Before modification --> ");
		set.forEach(System.out::println);

		Iterator<IndexUrlVO> iterator = set.iterator();
		IndexUrlVO temp = null;
		int size = set.size();
		for (int i = 0; i < size; i++) {
//				  testez conexiunea
//				  HttpURLConnection connection = (HttpURLConnection) ctx.getRouteHost().openConnection();
//		          connection.setConnectTimeout(5);
//		          int responseCode = connection.getResponseCode();
//		          if (!isHostReachable(responseCode)) { 
			IndexUrlVO vo = set.first();
			if (temp == null) {
				temp = vo;
			} else {
				vo = set.ceiling(temp);
			}
			IndexUrlVO vo2 = new IndexUrlVO(vo.getAccesedTimes() + 1, vo.getUrl());
			set.add(vo2);

		}
//		          }
		System.out.println("After modification --> ");
		set.forEach(System.out::println);

		String n = "37333373";
		boolean isPalindrom = true;

		for (int i = 0, j = n.length() - 1; i < n.length() / 2 + 1 && isPalindrom; i++, j--) {
			if (n.charAt(i) != n.charAt(j)) {
				isPalindrom = false;
			}
		}
		if (isPalindrom) {
			System.out.println("Acest numar este palindrom");
		} else {
			System.out.println("Acest numar nu este palindrom");
		}

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "-->");
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("TresCinco");
				} else {
					System.out.println("Tres");
				}
			} else if (i % 5 == 0) {
				System.out.println("Cinco");
			} else {
				System.out.println();
			}

		}
	}

	static class IndexUrlVO {
		private int accesedTimes;
		private String url;

		public IndexUrlVO(int accesedTimes, String url) {
			super();
			this.accesedTimes = accesedTimes;
			this.url = url;
		}

		public int getAccesedTimes() {
			return accesedTimes;
		}

		public void setAccesedTimes(int accesedTimes) {
			this.accesedTimes = accesedTimes;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		@Override
		public String toString() {
			return "IndexUrlVO [accesedTimes=" + accesedTimes + ", url=" + url + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + accesedTimes;
			result = prime * result + ((url == null) ? 0 : url.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			IndexUrlVO other = (IndexUrlVO) obj;
			if (accesedTimes != other.accesedTimes)
				return false;
			if (url == null) {
				if (other.url != null)
					return false;
			} else if (!url.equals(other.url))
				return false;
			return true;
		}

	}
}
