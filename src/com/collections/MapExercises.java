package com.collections;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapExercises {

	public static void main(String[] args) {
		Map<String, Person> map = new HashMap<>();
		map.put("Aditza", new Employee("Adi", "192829292822", "Luxoft"));
		map.put("Bobitza", new Employee("Bogdan", "1983983892", "DB"));
		map.put("Andy", new Student("Andrei", "198398933", 25, "SIIT"));
		//pt a evita suprascrierea lui Andy existent in Map,  putem folosi computeIfAbsent
		map.computeIfAbsent("Andy", key -> new Student("Andrei", "198398933", 26, "Telacad"));
		
		map.keySet().forEach(name -> System.out.println(name));
		System.out.println(map.get("Andy").toString());
		
		//   Person apply(String t);
		Function<String, Person> mappingFunction = (String key) -> new Employee("Adi", "192829292822", "Adobe");
		map.computeIfAbsent("Aditza", mappingFunction);
		
		System.out.println(map.get("Aditza").toString());
		
		// R apply(T t, U u);
		BiFunction<String, Person, Person> remappingFunction = (String p, Person p1) -> {return new Employee("Adi", "192829292822", "Adobe");};
		map.computeIfPresent("Aditza", remappingFunction);
		System.out.println(map.get("Aditza").toString());
		
		map.containsKey("jhsd"); //returns true is funds that key
		
		//    void accept(T t, U u);
		map.forEach((String porecla, Person person) -> out.println(porecla +" -->   " + person));
		Set<Entry<String, Person>> entrySet = map.entrySet();
		System.out.println("\n\n Entry set:  ");
		entrySet.forEach(entry -> System.out.println("Key: "+entry.getKey() +", Value: "+ entry.getValue()));
		
	}

}
