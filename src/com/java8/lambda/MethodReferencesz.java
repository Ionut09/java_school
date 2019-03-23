package com.java8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferencesz {

	public static void main(String[] args) {
		Consumer<List<String>> function = list -> Collections.sort(list);
		Consumer<List<String>> methodReference = Collections::sort;
		Predicate<String> predicate = s -> s.isEmpty();
		Predicate<String> metRefPred = String::isEmpty;
	}
}
