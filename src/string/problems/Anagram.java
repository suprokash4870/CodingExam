package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a = "Binary";
        String b = "Brainy";

        char[] arrayOfCharFromStringA = a.toCharArray();
        char[] arrayOfCharFromStringB = b.toCharArray();

        Arrays.sort(arrayOfCharFromStringA);
        Arrays.sort(arrayOfCharFromStringB);

        if (Arrays.equals(arrayOfCharFromStringA, arrayOfCharFromStringB)) {

            System.out.println("Words are annangram");
        } else {
            System.out.println("Words are not annagram");
        }
    }
}
