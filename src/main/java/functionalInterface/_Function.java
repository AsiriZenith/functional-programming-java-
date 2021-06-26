package functionalInterface;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

//        Function takes 1 argument and produces 1 result
        int increment = incrementByOne(2);
        // System.out.println(increment);

        int incrementUsingFunction = incrementByOneFunction.apply(5);
//        System.out.println(incrementUsingFunction);

        int multiplyBy10 = multiplyBy10Function.apply(incrementUsingFunction);
//        System.out.println(multiplyBy10);

        System.out.println(addBy1AndThenMultiplyBy10.apply(0));

//        BiFunction takes 2 argument and produces 1 result
        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4,100)
        );
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 2;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer,Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                    -> (numberToIncrementByOne+1) * numberToMultiplyBy;

    public static int incrementByOne(int number) {
        return number+1;
    }
}
