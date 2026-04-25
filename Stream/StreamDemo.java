package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    static void main() {
        // feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify data processing that is helps in removing if and else
        // Improve Readability and maintainability
        // Enable easy parallelism

        // What is Stream ?
        // a sequence of elements supporting functional and declarative programing

        // how to use it
        // Source , intermediate operations & terminal operation
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int count = 0;
        for(int i=0;i<numbers.size();i++){
            if(i%2==0) count++;
        }
        System.out.println("Result using Basic : "+count);
        // we can replace this with stream
        System.out.println("Stream : " +numbers.stream().filter(x -> x%2==0).count());

        // Stream creation
        // 1.From Collections
        List<Integer> number = Arrays.asList(1,2,3,4);
        // 2.From Arrays
        String[] arr = {"a","b","c"};
        Stream<String> stream = Arrays.stream(arr);
        // 3.Using Stream.of()
        Stream<String> a = Stream.of("a", "b");



    }
}
