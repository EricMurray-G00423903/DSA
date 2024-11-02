import java.util.*;

public class WarmerDays {
    
    public static void main(String[] args) {

        int[] temperatures = { 20, 22, 23, 19, 20, 30, 28};     //Expected return [1, 1, 3, 1, 1, 0, 0]
        System.out.println("Returned Array : " + Arrays.toString(warmerDays(temperatures)));
        
    }

    public static int[] warmerDays(int[] arr) {

        int[] newArr = new int[arr.length];
        Stack<Integer> indices = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            // While there's a previous day in the stack that has a lower temperature than today
            while (!indices.isEmpty() && arr[i] > arr[indices.peek()]) {
                int prevIndex = indices.pop();  // Get the index of the previous day
                newArr[prevIndex] = i - prevIndex; // Calculate the days waited and store it
            }

            // Add current day to the stack
            indices.push(i);
        }

        return newArr;

    }
}
