/*
 * Handling Edge Cases for Binary Search
 * 
 * Stop the Binary Search Algorithm from fully running
 * No point in running a binary search on a huge array for example if the target is > or < the start/end of array
 * 
 * There are more edge cases that could be handled here
 * Multiple instances of the target in the array
 * 
 */
public class EdgeCases {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Control Testing Condition
        int target = 10;
        int[] arr = {1, 2, 5, 8, 10, 20, 32, 50, 90, 100, 109, 201, 2002};

        int result = edgeBinarySearch(arr, target);

        System.out.println("The result of the control search was: " + result);
        
        // Edge case 1 - Empty Array
        int targetOne = 10;
        int[] arrOne = {};

        System.out.print("Testing Empty Array: ");
        int resultOne = edgeBinarySearch(arrOne, targetOne);

        // Edge Case 2 - Target out of array 'range'
        int targetTwo = 100;
        int[] arrTwo = {5, 8, 20, 50, 90};

        System.out.print("Testing Target Out Of Range: ");
        int resultTwo = edgeBinarySearch(arrTwo, targetTwo);

        // Edge Case 3 - Array of length 1
        int targetThree = 4;
        int[] arrThree = {4};

        System.out.print("Testing Array of length 1: ");
        int resultThree = edgeBinarySearch(arrThree, targetThree);

    }

    public static int edgeBinarySearch(int[] arr, int target) {

         // Binary Search is a 2-Pointer problem - Start and End
         int start = 0;
         int end = arr.length - 1;
         int mid;

        // Handle Edge Cases

            // Edge Case 1 - Empty Array
            if (arr.length <= 0) {
                System.out.println("Array is empty!");
                return -1;
            }

            // Edge Case 2 - Target out of range
            if(target > arr[end] || target < arr[start]) {
                System.out.println("Target is not in array (Outside of Arrays Range)");
                return -1;
            }

            // Edge Case 3 - Array Length 1
            if (arr.length == 1) {

                if (arr[0] == target) {
                    System.out.println("Target is only element in Array!");
                    return 0;
                } else {
                    System.out.println("Target not in single element array");
                    return -1;
                }

            }

        // End Handle Edge Cases
 
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


        System.out.println(target + " was not found in array!");
        return -1;
    }
}
