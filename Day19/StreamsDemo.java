package Day19;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);

		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		System.out.println(squareSet);

		// demonstration of forEach method
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// demonstration of reduce method
		int evenSum = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		System.out.println(evenSum);
	}
}