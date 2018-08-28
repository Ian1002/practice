package com.ian.practice.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class Java8Test {

	public static boolean test(String param) {

		System.out.println("param : " + param);
		return true;
	}

	public static void main(String[] args) {

		// params.forEach(Java8Test::test);

		// Consumer<String> methodParam = Java8Test::test;
		// params.forEach(param -> methodParam.accept(param));

		// int ids[] = new int[] { 1, 2, 3, 4 };
		// Arrays.stream(ids).forEach(System.out::println);

//		Stream.of(5, 4, 6, 2, 1, 3).sorted().forEach(System.out::println);

//		Comparator<Integer> comparator = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if (o1 < o2)
//					return -1;
//				else if (o1 == 01)
//					return 0;
//				return 1;
//			}
//		};
		
		Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));  

//		Comparator<Integer> comparator = (Integter o1, Integer o2) -> (1);

//		Stream.of(5, 4, 6, 2, 1, 3).sorted(comparator).forEach(System.out::println);

	}
}
