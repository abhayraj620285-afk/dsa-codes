package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,3,4);

        // 1.Collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2.forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce : combines elements to produce a single output
        // in reduce((x,y) -> x+y) -> converted to method reference
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch,allMatch,noneMatch
        boolean a = list.stream().anyMatch(x -> x%2==0);
        System.out.println(a);
        boolean b = list.stream().allMatch(x -> x>0);
        System.out.println(b);

        // 6. forEachOrdered
        // Used for sequential execution

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Using forEach with parallel streams");
        number.parallelStream().forEachOrdered(System.out::println);

        // Examples
        List<String> names = Arrays.asList("Abhay","raj","yash");
        System.out.println(names.stream().filter(x -> x.length()>=4 ).toList());
        // Squaring and sorting
        List<Integer> numbers = Arrays.asList(5,3,7,9,1);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        // Summing all the values
        List<Integer> allSum = Arrays.asList(5,3,7,9,1);
        System.out.println(allSum.stream().reduce( (x,y) -> x+y).get());

        // Example
        // Streams cannot be called again after a terminal operation
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        List<String> list1 = stream.map(String::toUpperCase).toList();
        System.out.println(list1);
    }
}
