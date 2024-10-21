import java.util.Arrays;    // For toString

public class Exercise2 {
    
    public static void main(String[] args) {
        
        int targetOne = 2;
        int targetTwo = 5;
        int targetThree = 1;

        int[] arrOne = {1, 2, 2, 2, 4, 5};          // Expected return - [1, 3]
        int[] arrTwo = {1, 2, 3, 4, 5, 5, 5, 6};    // Expected return - [4, 6]
        int[] arrThree = {2, 3, 4};                 // Expected return - [0, 0];

        System.out.println(Arrays.toString(multiBinary(arrOne, targetOne)));
        System.out.println(Arrays.toString(multiBinary(arrTwo, targetTwo)));
        System.out.println(Arrays.toString(multiBinary(arrThree, targetThree)));
    }

    public static int[] multiBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int[] result = new int[2];

        int startIndex = 0;
        int endIndex = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
              
                // Search all instances to the left
                int left = mid - 1;
                while (left >= 0 && arr[left] == target) { 

                    // Check to see if the current leftPointer is the first instance of target
                    if(arr[left - 1] != target) {
                        result[0] = left;
                        break;
                    }

                    left--; // Move the left pointer if the there are more instances

                }

                // Search so the exact same as above making sure the right stays under the size of the array
                int right = mid + 1;
                while (right < arr.length && arr[right] == target) {

                    // Check to see if its the last instance of the target
                    if(arr[right + 1] != target) {
                        result[1] = right;
                        break;
                    }
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

      
        return result;
    }
}
