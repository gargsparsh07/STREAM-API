import java.util.Arrays;
import java.util.List;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        // UC2.1
        numbers.stream()
                .forEach(System.out::println);

        // UC2.2
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        // UC2.3: Collect results after map
        List<Integer> doubled = numbers.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println(doubled);
    }
}