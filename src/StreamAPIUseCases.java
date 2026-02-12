import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        // UC2.1
        numbers.stream().forEach(System.out::println);

        // UC2.2
        numbers.stream().map(n -> n * 2).forEach(System.out::println);

        // UC2.3
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(doubled);

        // UC2.4
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // UC2.5
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresent(System.out::println);

        // UC2.6
        numbers.stream().min(Integer::compareTo)
                .ifPresent(min -> System.out.println("Min: " + min));

        numbers.stream().max(Integer::compareTo)
                .ifPresent(max -> System.out.println("Max: " + max));

        // UC2.7
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        // UC2.8
        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        System.out.println("Any Even: " + anyEven);
        System.out.println("All Even: " + allEven);

        // UC2.9: Sort ascending using sorted
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
