package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    static void main() {
        // Intermediate op transform stream into another stream
        // They are lazy,meaning they do not execute until a terminal operation is invoked

        // 1. filter
        List<String> list = Arrays.asList("Abhay","Raj","Abhi");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // till now no filtering is done
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        // now it is filtered
        System.out.println(res);

        // 2. Map
        Stream<String> toUpper = list.stream().map(x -> x.toUpperCase());

        // 3. sort
        Stream<String> sortedStream = list.stream().sorted();

        // 4.distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5.Limit
        System.out.println(Stream.iterate(1 ,x -> x+1).limit(100).count());

        // 6.Flatten
        List<String> sentences= Arrays.asList(
                "Hello World",
                "Java streams are powerful",
                "flatmap is useful"
        );
        System.out.println(sentences.stream().flatMap(sentence ->Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());
    }
}
