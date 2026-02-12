import java.util.Arrays;
import java.util.List;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        numbers.stream().forEach(System.out::println);

        numbers.stream().map(n -> n * 2).forEach(System.out::println);

        List<Integer> doubled = numbers.stream().map(n -> n * 2).toList();
        System.out.println(doubled);

        // UC2.4: Filter even numbers
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}