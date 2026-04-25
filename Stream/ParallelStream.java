package Stream;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ParallelStream {
    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Used atomic integer because normal variable have to be final to use on lambda expression
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(sum::addAndGet).toList();
        // gives unexpected output because parallelStream is independent stream

        System.out.println(cumulativeSum);
    }
}
