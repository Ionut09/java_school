package com.java8.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

public class Streams {

	static Trader raoul = new Trader("Raoul", "Cambridge");
	static Trader mario = new Trader("Mario", "Milan");
	static Trader alan = new Trader("Alan", "Cambridge");
	static Trader brian = new Trader("Brian", "Cambridge");

	static List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
															new Transaction(raoul, 2012, 1000), 
															new Transaction(raoul, 2011, 400), 
															new Transaction(mario, 2012, 710),
															new Transaction(mario, 2012, 700), 
															new Transaction(alan, 2012, 950));
	public static void main(String[] args) {
//		printList(findTransactionsFrom2011());
//		printListString(getUniqueCities());
//		printListString(getTradersFromCity("Cambridge"));
//		System.out.println(getTradersNames());
//		String answer = areTradersInCity("Milan") ? "YES" : "NO";
//		System.out.println("Are any traders based in Milan? --> " + answer);
//		printTransactionsFromTradersLivingInCity("Cambridge");
		System.out.println(findSmallestTransactionValue());
	}

	private static void printList(Collection<Transaction> list) {
		list.forEach(System.out::println);
	}

	private static void printListString(Collection<String> list) {
		list.forEach(System.out::println);
	}

	private static List<Transaction> findTransactionsFrom2011() {
		return transactions.stream() // Stream<Transaction>
							.filter(transaction -> transaction.getYear() == 2011) // Stream<Transaction>
							// .sorted((tr1, tr2) -> tr1.getValue() - tr2.getValue())
							// .sorted(Comparator.comparing(tr -> tr.getValue()));
							.sorted(Comparator.comparing(Transaction::getValue)) // foloseste obiectul de tip Transaction de pe
																					// context ca sa apeleze getValue
							.collect(Collectors.toList());
	}

	/**
	 * What are all the unique cities where the traders work?
	 */
	private static Set<String> getUniqueCities() {
		return transactions.stream()
							// .map(transaction -> transaction.getTrader())
							.map(Transaction::getTrader) // Stream<Trader>
							.map(Trader::getCity) // Stream<String>
							.collect(toSet());

	}

	/**
	 * Find all traders from Cambridge and sort them by name.
	 */
	private static Set<String> getTradersFromCity(String city) {
		return transactions.stream()
							.map(Transaction::getTrader) // Stream<Trader>
							.filter(trader -> trader.getCity().equals(city))
							.map(Trader::getName) // Stream<String>
							// .collect(toCollection(() -> new TreeSet<>()));
							.collect(toCollection(TreeSet::new));

	}

	/**
	 * Return a string of all traders’ names sorted alphabetically.
	 */
	private static String getTradersNames() {
		return transactions.stream()
							.map(Transaction::getTrader) // Stream<Trader>
							.map(Trader::getName) // Stream<String>
							.sorted().distinct()
							// .reduce("", (seed, name) -> seed.concat(name));
							// .reduce("", StringBuilder::append, StringBuilder::append) //p faceti voi sa
							// mearga
							.collect(Collectors.joining(","));

	}

	/**
	 * Are any traders based in Milan?
	 */
	private static boolean areTradersInCity(String city) {
		return transactions.stream()
							.map(Transaction::getTrader) // Stream<Trader>
							.anyMatch(trader -> trader.getCity().equals(city));

	}

	/**
	 * Print all transactions’ values from the traders living in Cambridge.
	 */
	private static void printTransactionsFromTradersLivingInCity(String city) {
		transactions.stream()
					.filter(transaction -> transaction.getTrader().getCity().equals(city))
					.mapToInt(transaction -> transaction.getValue()) // IntStream
					.forEach(e -> System.out.println(e + ","));

	}

	private static int findHighestTransactionValue() {
		return transactions.stream()
							.mapToInt(transaction -> transaction.getValue()).max()
							// .getAsInt();
							// .ifPresent(elem -> System.out.println(elem));
							.orElse(0);
	}

	private static int findSmallestTransactionValue() {
		return transactions.stream()
							.mapToInt(transaction -> transaction.getValue()).min()
							// .getAsInt();
							// .ifPresent(elem -> System.out.println(elem));
							.orElse(0);
	}
}
