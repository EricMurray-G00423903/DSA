package Strings;

public class StringLeet {
    
    public static void main(String[] args) {
        
        String nonPal = "brutal";
        String pal = "racecar";

        String[] prefixStrings = {"flower", "flow", "flight"};
        String[] noPrefixStrings = {"power", "tower", "lower"};

        // Check to see if passed strings are palindromes
        System.out.println(checkPal(nonPal));   //expected false
        System.out.println(checkPal(pal));      //expected true
        
        // Check to see if there is a common prefix
        System.out.println(longestPrefix(prefixStrings));   //expected "fl"
        System.out.println(longestPrefix(noPrefixStrings)); //expected ""
    }

    public static boolean checkPal(String stringCheck) {    //Basically just a reverse string method with a comparison

        StringBuilder reversed = new StringBuilder(stringCheck.length());   //New String builder to make the reversed string [String is immutable]

        for (int i = stringCheck.length() - 1; i >= 0; i--) {   //Loop over the passed string from the end
            reversed.append(stringCheck.charAt(i)); //add the end char of the passed string to the string builder
        }

        String compareReversed = reversed.toString();   //Turn the stringbuilder into a string

        if(stringCheck.equalsIgnoreCase(compareReversed)) { //if theyre the same ignoring case return true
            return true;
        }

        return false;   //return false if it gets here

    }

    public static String longestPrefix(String[] arr) {

        String prefix = arr[0]; //initialise the prefix with the first word

        for (int i = 1; i < arr.length; i++) {  //iterate over each word in the array

            while(!arr[i].startsWith(prefix)) { //if the current word being checked does NOT start with the prefix [flower in this example]
                prefix = prefix.substring(0, prefix.length() -1);   //Then loop and reduce the prefix by 1 char and check again [flower will become flow - then it will go the next word flight]
            }                                                                  //Then for the while loop the prefix will reduce to "fl"

        }

        return prefix;
    }

}
