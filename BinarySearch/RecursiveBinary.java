/*
 * A Recursive Binary Search is, instead of using a while/for loop to achieve a binary search
 * The Function recalls itself passing in different parameters each time
 * 
 * Recalling itself creates the loop instead of an inherent while/for loop
 * 
 * This is recursion
 * 
 * The benefits to this over the iterative method are purely readability
 * 
 * Time Complexity is still O(log n)
 * 
 * For larger data sets, this can cause a stack overflow from continously recalling the function ontop of the stack
 * Not recommended for use on larger data sets
 * 
 * Purely for readability and concise code/education
 * 
 */

public class RecursiveBinary {

    public static void main(String[] args) {

        // To call the recursive binary we need to pass in the start/left and end/right
        int target = 19;
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 20, 40, 44};

        int start = 0;
        int end = arr.length - 1;

        System.out.println("Searching for " + target + " in the data set.");
        int result = rescursiveBS(arr, start, end, target);

        if(result == -1) {
            System.out.println("Target not in array!");
        } else {
            System.out.println("Target found at the " + result + " index!");
        }

        
        
    }

    // need to pass in the start and end each time so theyre listed as parameters as opposed to iterative where we can define them in the func
    public static int rescursiveBS(int[] arr, int start, int end, int target) {

        // if the start is less than or equal to the end
        if(start <= end) {

            // calculate the midpoint ** start + (end - start) / 2 ** - This is used to stop adding two large integers together and getting an integer overflow!
            // In the iterative example we did ** mid = (start + end) / 2; ** If we did this with massive numbers then the integer would go negative
            // This method is precautionary not necessary for these data sets but good practice ( we wouldnt be using recursive BS if the data set was that large regardless)
            int mid = start + (end - start) / 2;

            // if the midpoint is the target
            if(arr[mid] == target) {

                return mid;

            }
                
            // if the mid point is bigger than the target, the target must be on the left hand side of array
            if(arr[mid] > target) {

                // recall the function, start point doesnt change the end point is now the old midpoint (-1)
                return rescursiveBS(arr, start, mid - 1, target);

            }
                
            // else if the mid < target, the target is on the right hand side of the array
            // recall the function moving the start point to the old mid point
            return rescursiveBS(arr, mid + 1, end, target);
        }

        return -1;
    }
}
