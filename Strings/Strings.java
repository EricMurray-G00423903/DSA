package Strings;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        

        // Task 1 - Test basic string methods - Write a basic function to reverse a string
        String myString = "poster";
        String myString2 = "movie";
        String myString3 = "restaurant";

        System.out.println(myString.length());
        System.out.println(myString.charAt(0));
        System.out.println(myString.concat(myString2));

        System.out.println(reverseString(myString2));

        // Task 2 - Use substring() and indexing
        System.out.println(myString.substring(0, 4));
        System.out.println(myString2.indexOf("ov"));    //Finds the starting index of the passed string "First instance"
        System.out.println(myString2.lastIndexOf("ie"));    //Finds the starting index of the passed string "Last instance"

        //Task 3 - Manipulation
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());

        System.out.println(myString3.replace("a", "e"));    //Replaces all instances of the target
        //System.out.println(myString3.replaceAll(//regex, //replacewith)); //Replace all gets replaces String regex with a value

        // Task 4 - Split and Trimming - use split, then write a function to count the words in a sentence
        String longString = "This is a longer string";
        String[] splitString = longString.split("\\s"); // Split() returns a string array takes a regex expression on where to split the words \\s for whitespaces

        System.out.println(Arrays.toString(splitString));

        System.out.println(countWords(longString)); // Should return 5

        System.out.println(longString.trim());  // Trims whitespaces at the start and end of a string
        
    }

    public static String reverseString(String stringToReverse) {
        StringBuilder reversed = new StringBuilder(stringToReverse.length());

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversed.append(stringToReverse.charAt(i));
        }

        return reversed.toString();
    }

    public static int countWords(String stringToCount) {

        int totalWords = 0;

        String[] split = stringToCount.split("\\s");
        totalWords = split.length;

        return totalWords;
    }

}
