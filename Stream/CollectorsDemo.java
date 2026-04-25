package Stream;
import javax.sound.sampled.Line;
import java.util.*;
import java.util.stream.Collectors;
public class CollectorsDemo {
    static void main() {
        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a Specific Collection
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);

        // 4. Joining Strings
        // Concatenates stream elements into a single String
        String concatenatedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // Example 1 : Collecting names by length
        List<String> name = Arrays.asList("Abhay","Satyam","raj","Ram");
        System.out.println(names.stream().collect(Collectors.groupingBy(String :: length)));

        // Example 2 : counting words occurrence
        String sentence = "hello how are you what are you doing";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x,Collectors.counting())));

        // Example 3 : Summing all values
        Map<String,Integer> mp = new HashMap<>();
        mp.put("items",20);
        mp.put("apple",34);
        mp.put("kela",36);
        System.out.println(mp.values().stream().reduce(Integer::sum));




    }

}
