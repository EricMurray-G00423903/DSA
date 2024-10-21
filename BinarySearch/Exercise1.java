import java.util.ArrayList; // Import for using a dynamic array size stop hardcoding size
import java.util.Arrays;    // For toString

public class Exercise1 {
    
    public static void main(String[] args) {
        
        int targetOne = 2;
        int targetTwo = 5;
        int targetThree = 1;

        int[] arrOne = {1, 2, 2, 3, 4, 5};          // Expected return - [1, 2]
        int[] arrTwo = {1, 2, 3, 4, 5, 5, 5, 6};    // Expected return - [4, 5, 6]
        int[] arrThree = {2, 3, 4};                 // Expected return - [];

        System.out.println(Arrays.toString(multiBinary(arrOne, targetOne)));
        System.out.println(Arrays.toString(multiBinary(arrTwo, targetTwo)));
        System.out.println(Arrays.toString(multiBinary(arrThree, targetThree)));
    }

    public static int[] multiBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        ArrayList<Integer> locations = new ArrayList<>();  // Use ArrayList for dynamic sizing

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                // Add the middle index
                locations.add(mid);

                // Search all instances to the left
                int left = mid - 1;
                while (left >= 0 && arr[left] == target) {  // Add in the condition that left needs to be 0 or greater to stop it going out of bounds
                    locations.add(left);    // Add index to our collection
                    left--; // Move the left pointer
                }

                // Search so the exact same as above making sure the right stays under the size of the array
                int right = mid + 1;
                while (right < arr.length && arr[right] == target) {
                    locations.add(right);
                    right++;
                }

                // Break as all occurrences have been found
                break;

            } else if (arr[mid] < target) {     // Standard binary search code to move mid pointer
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Convert ArrayList to an array before returning - Because the function needs an int[] return type
        int[] result = new int[locations.size()];
        locations.sort(null);   // Use the sort() to sort the array to give the expected outcome
        for (int i = 0; i < locations.size(); i++) {
            result[i] = locations.get(i);   // Populate the new array with the corresponding index of the List
        }

        return result;
    }
}
