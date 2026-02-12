import java.util.Arrays;
import java.util.List;

public class StreamAPIUseCases {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 5, 8, 11, 14);

        // UC2.1: Create stream and iterate elements
        numbers.stream()
                .forEach(System.out::println);

        // UC2.2: Transform elements using map
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}