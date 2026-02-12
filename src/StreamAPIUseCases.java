import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        // UC2.1: Create stream and iterate elements
        numbers.stream().forEach(System.out::println);

        // UC2.2: Transform elements using map
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // UC2.3: Collect results after map
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(doubled);

        // UC2.4: Filter even numbers using filter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // UC2.5: Find first even number using findFirst
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        firstEven.ifPresent(System.out::println);
    }
}
