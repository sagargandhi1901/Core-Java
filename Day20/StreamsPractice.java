package Day20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsPractice {
	public static void main(String[] args) {

//		Question 1 : Count every character occurance in a string

//		String str = "sagargandhi";
//		Map<String, Long> collect = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(s -> s /*Function.identity()*/, Collectors.counting()));
//		System.out.println(collect);

//		Question 2 : Find all duplicate characters in a string

//		String str = "sagargandhi";
//		List<String> collect = Arrays.stream(str.split(""))
//				.collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//				.entrySet()
//				.stream()
//				.filter(x -> x.getValue() > 1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		System.out.println(collect);

//		Question 3 : Find second highest number in a given array

//		int[] arr = { 10, 45, 30, 67, 22, 8 };
//		Integer secondHighest = Arrays.stream(arr)
//				.boxed()
//				.sorted(Comparator.reverseOrder())
//				.skip(1)
//				.findFirst()
//				.get();
//		System.out.println(secondHighest);
		
//		Question 4 : Find longest String from a given string array
		
//		String[] arr = {"java", "hibernate", "spring", "springboot"};
//		String longestString = Arrays.stream(arr)
//				.reduce((a, b) -> a.length() > b.length() ? a : b)
//				.get();
//		System.out.println(longestString);
		
//		Question 5 : Find all elements in array that starts with 1
		
//		int[] arr = { 10, 45, 14, 67, 12, 8 };
//		List<String> numbers = Arrays.stream(arr)
//				.boxed()
//				.map(s -> s + "")
//				.filter(s -> s.startsWith("1"))
//				.collect(Collectors.toList());
//		System.out.println(numbers);
	}
}