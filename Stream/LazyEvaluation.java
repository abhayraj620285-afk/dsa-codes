package Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    static void main() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation");

        List<String> result = stream.collect(Collectors.toList());

        System.out.println("After terminal operation");
        System.out.println(result);
    }
}
