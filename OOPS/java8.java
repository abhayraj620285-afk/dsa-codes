package OOPS;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class java8 {
    static void main() {

    MathOperation sumOperation = (int a,int b)-> {
        return a+b;
    };
    int ans = sumOperation.operation(23,12);
    System.out.println(ans);

        // Predicate --> Functional Interface (Boolean valued function)
        // Holds a specific condition
        Predicate<Integer> isEven = a -> a%2==0;
        System.out.println(isEven.test(4));

        // Function
        Function<Integer,Integer> doubleIt = x -> x*2;
        System.out.println(doubleIt.apply(2));

        //static interface
        Function<Integer,Integer> identity = Function.identity();
        int val = identity.apply(5);
        System.out.println(val);

        // Consumer -> only consume the info
        Consumer<Integer> print = System.out::println;
        print.accept(23);

        // Supplier -> only get the info
        Supplier<String> printHelloWorld = () -> "Hello World";
        System.out.println(printHelloWorld.get());

        // All Combined
        Predicate<Integer> predicate = x -> x%2==0;
        Function<Integer,Integer> function = x -> x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x+y)%2==0;
        BiConsumer<Integer,Integer> biConsumer = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };

        // ****** Method Reference ********//

        // use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram","Shyam","Abhay");

        students.forEach(x -> System.out.println(x));

        students.forEach(System.out::println);







    }





@FunctionalInterface
    interface MathOperation{
        // Single Abstract method
        int operation(int a,int b);
    }
}
