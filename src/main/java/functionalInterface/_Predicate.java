package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0703838207"));
        System.out.println(isPhoneNumberValid("0914275816"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0703838207"));
        System.out.println(isPhoneNumberValidPredicate.test("0914275816"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("0703838207")
        );
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("0914275816")
        );
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("0914375816")
        );
    }

    public static boolean isPhoneNumberValid(String number) {
        return number.startsWith("07") && number.length() == 10;
    }

    public static Predicate<String> isPhoneNumberValidPredicate = number
            -> number.startsWith("07") && number.length() == 10;

    public static Predicate<String> containsNumber3 = number
            -> number.contains("3");
}
