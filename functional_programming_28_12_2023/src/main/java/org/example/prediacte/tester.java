package org.example.prediacte;

import java.util.function.Predicate;

public class tester {
    public static void main(String[] args) {
        //old school
        System.out.println("without predicate");
        System.out.println(isPhoneNumberValid("052-4043142"));
        System.out.println(isPhoneNumberValid("050-5433874"));
        System.out.println(isPhoneNumberValid("054-8374892"));

        //predicate
        Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
                phoneNumber.startsWith("05") && phoneNumber.length()==11;

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("052-404-3142"));
        System.out.println(isPhoneNumberValidPredicate.test("050-5433874"));
        System.out.println(isPhoneNumberValidPredicate.test("972-8374892"));

        System.out.println("is phone number valid or containes 3 = "+
                isPhoneNumberValidPredicate.or(containsNumber3).test("972-4043142"));
    }

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("05") && phoneNumber.length()==11;
    }
}
