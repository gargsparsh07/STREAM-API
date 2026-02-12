import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        numbers.stream().forEach(System.out::println);

        numbers.stream().map(n -> n * 2).forEach(System.out::println);

        List<Integer> doubled = numbers.stream().map(n -> n * 2).toList();
        System.out.println(doubled);

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        firstEven.ifPresent(System.out::println);

        numbers.stream().min(Integer::compareTo)
                .ifPresent(min -> System.out.println("Min: " + min));

        numbers.stream().max(Integer::compareTo)
                .ifPresent(max -> System.out.println("Max: " + max));

        // UC2.7: Sum and Average
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
