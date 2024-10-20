/*
 *
 * Basic Implementation of Binary Search - Iterative Method
 * Iterative Method - using while/for loops to iterative over the sorted array
 * 
 * Binary Search is a method of Divide & Conquer!
 * 
 * Can only search within SORTED arrays successfully
 * 
 * Key Advantage to using Iterative over Recursive - Iterative uses far less memory on larger inputs
 * 
 * Binary Search Time Complexity - O(log n) 
 * 
*/

public class Basic {

    public static void main(String[] args) {

        // Some testing conditions
        int target = 12;
        int[] arr = {1, 2, 5, 8, 10, 20, 32, 50, 90, 100, 109, 201, 2002};
        System.out.println("Searching for: " + target);

        int result = binaryBasicSearch(arr, target);

        System.out.println("The result of the search was: " + result);        
    }

    public static int binaryBasicSearch (int[] arr, int target) {

        // Binary Search is a 2-Pointer problem - Start and End
        int start = 0;
        int end = arr.length - 1;
        int mid;

        // While the start pointer is less than or equal the end pointer
        while(start <= end) {

            // Move the midpoint to the mid point of the start and end on each loop
            mid = (start + end) / 2;

            // if the target is in the midpoint 
            if (arr[mid] == target) {

                // return the mid - index of target
                return mid;

            } else if (arr[mid] < target) {     // if the current midpoint is less than the target that means the target is to the 'right' in the array of the current midpoint
                start = mid + 1;       // move the start pointer to the current midpoint and add 1
            } else {
                end = mid - 1;  // else(the target is to the 'left' in the array) then move the end pointer instead
            }

            // Re-loop

        }

        // Conditions of the target isn't found
        System.out.println(target + " was not found!");
        return -1;

    }

}