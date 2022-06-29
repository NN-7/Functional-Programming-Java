package FunctionsInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Functions

        System.out.println("Num in string: " + numInString.apply(3567565));
        System.out.println("Increment by one: " +incrementByOne.apply(1));
        System.out.println("Int to double: " +intToDouble.apply(5));
        System.out.println("Multiply by ten: " +multiplyByTen.apply(7));

        System.out.println("Increment by one and then multiply by ten: " +
                chainedFunc1.apply(6));
        System.out.println("Increment by one, multiply by ten and then to double: " +
                chainedFunc2.apply(6));

        // BiFunctions - take two arguments and return one result

        System.out.println("Increment by one and multiply by multiplier" + biFunction1.apply(3,10));
    }

    /*

    Explanation of Function:

    Functions take 1 argument and return 1 result.

    When making a function, the first generic represents the type of the input, and the second represents the type
    of the output.

    So for:
    Function<Integer, Integer> Input: Integer   Output: Integer
    Function<Integer, Float> Input: Integer   Output: Float
    Function<Float, String> Input: Float  Output: String
    Function<Integer, String> Input: Integer   Output: String

    Now, when defining the function, there is a lambda to be made.
    Example: number -> number+1 (Function<Integer, Integer> funcName = number -> number+1;)

    The variable that comes before the -> represents the input variable.
    Therefore, the output will be the input plus one.

    When calling a function, you write its name, and add .apply() as a suffix to it,
    putting in an input in between the brackets.

    Example of a Function working:

    Function<Integer, Integer> funcName = number -> number+1;
    System.out.println(incrementByOne.apply(1));

    output:
    2

    To chain functions, you write the name of one function, add .andThen as a suffix, putting the name of another
    function in between the brackets.

    Example:

    static Function<Integer, Integer> chainedFunc1 = incrementByOne.andThen(multiplyByTen);
    */

    static Function<Integer, Double> intToDouble = number -> number+0.1456567;

    static Function<Integer, String> numInString = number -> "number is "+number;

    static Function<Integer, Integer> incrementByOne = number -> number+1;

    static Function<Integer, Integer> multiplyByTen = number -> number*10;

    static Function<Integer, Integer> chainedFunc1 = incrementByOne.andThen(multiplyByTen); // (i++)*10

    static Function<Integer, Double> chainedFunc2 = incrementByOne.andThen(multiplyByTen).andThen(intToDouble); // (i++)*10+0.1456567

    /*

    BiFunctions are essentially functions, except they take two parameters/inputs.

    */

    static BiFunction<Integer, Integer, Integer> biFunction1 = (incremented, multiplier) -> (incremented+1)*multiplier;
}
