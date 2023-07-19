package Day16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);
		
		// find the odd numbers, double it and add all
		
		// using for each loop
//		int sum = 0;
//		for (int n : nums) {
//			if (n % 2 == 1) {
//				n = n * 2;
//				sum += n;
//			}
//		}
//		System.out.println(sum);
		
		// using stream
		Stream<Integer> stream = nums.stream();
		
//		Consumer<Integer> consumer = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + " ");
//			}
//		}; 
//		nums.forEach(consumer);
		
//		Consumer<Integer> consumer = n -> System.out.print(n + " ");
//		nums.forEach(consumer);
		
//		stream.forEach(n -> System.out.println(n));
//		stream.forEach(n -> System.out.println(n));									// stream can't be reused once any operation done : IllegalStateException
		
		Stream<Integer> stream2 = nums.stream();
		Predicate<Integer> predicate = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
//				if (t % 2 == 1) {
//					return true;
//				}
//				else {
//					return false;
//				}
				return t % 2 == 1;
			}
		};
		
	
		Predicate<Integer> predicate2 = t -> t % 2 == 1;
		Stream<Integer> stream3 = stream2.filter(predicate2);
//		stream3.forEach(n -> System.out.println(n));
	
		System.out.println();
		
//		Function<Integer, Integer> function = new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t * 2;
//			}
//		};
		
		Function<Integer, Integer> function = t -> t * 2;
		Stream<Integer> stream4 = stream3.map(function);
//		stream4.forEach(n -> System.out.println(n));
		stream4.forEach(System.out::println);											// using method referance			
		
//		Integer result = stream4.reduce(0, (n1, n2) -> n1 + n2);
//		System.out.println(result);
		
		// Instead of creating a new stream evertime for every stream operation, we can do method chaining
		int result2 = nums.stream()
				.filter(t -> t % 2 == 1)
				.map(t -> t * 2)
				.reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(result2);
	}
}