package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Predicates");

        System.out.println(isPhoneNumberFromToronto.test("14169286492"));
        System.out.println(isPhoneNumberFromToronto.test("4836297310"));
        System.out.println(isPhoneNumberFromToronto.and(isPhoneNumberValid).test("14169286492"));
        System.out.println(isPhoneNumberFromToronto.and(isPhoneNumberValid).test("4836297310"));

        System.out.println("BiPredicates");

        System.out.println(areTwoStringsLongerThan11.test("abcd", "abcdef")); // 10 chars
        System.out.println(areTwoStringsLongerThan11.test("abcde", "abcdef")); // 11 chars
        System.out.println(areTwoStringsLongerThan11.test("abcde", "abcdefg")); // 12 chars
        System.out.println(areTwoStringsLongerThan11.test("abcdef", "abcdefg")); // 13 chars

    }

    /*

    Predicates are used to test whether a statement is true or false.

    To write a predicate, write the type of the object you'll be testing in between the arrows, and give it a name.

    Predicate<String> predicateExample

    Then, write the statement you would like to test. To do this, we write the name of the variable we want to use, add
    a -> after it, and specify out statement.

    string -> string.length() == 5;

    Now, add it after the name of the predicate, seperating the two with an equals sign.

    Predicate<String> predicateExample = string -> string.length() == 5;

    To use the predicate, we write its name, and add .test() after it, with the thing we want to test in between its
    brackets.

    predicateExample.test("abcde")

    To chain predicates, we use .and(), putting the name of the second predicate in between the brackets, and adding
    .test after the brackets with the thing we want to test.

    Predicate<String> predicateExample = string -> string.length() == 5;
    Predicate<String> predicateExample2 = string -> string.startsWith("a");

    predicateExample.and(predicateExample2).test("abcde");

    There is also a BiPredicate, which works similarly to other Bi functional interfaces.

    */

    static Predicate<String> isPhoneNumberFromToronto =
            phoneNumber -> phoneNumber.startsWith("1416");

    static Predicate<String> isPhoneNumberValid =
            phoneNumber -> phoneNumber.length() == 11;

    static BiPredicate<String, String> areTwoStringsLongerThan11 =
            (string1, string2) -> (string1+string2).length() > 11;

}
