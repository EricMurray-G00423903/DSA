package Arrays;

import java.util.Arrays;    // Import the arrays library


public class ArrayManipulation {

    public static void main(String[] args) {

        //Task 1 - Create an Array of Integers - Initialise - Print
        int[] taskOne = {3, 6, 10, 20, 22, 9, 40, 1, 69};
        System.out.print("Unsorted, Array.toString >> " + Arrays.toString(taskOne));

        //Task 2 - Sort array of ints - Strings - Print all
        //Use the previous task to show the unsorted array and then print it sorted
        Arrays.sort(taskOne);
        System.out.println(" || Same array, sorted Arrays.sort() >> " + Arrays.toString(taskOne));

        //Init string array and use sort
        String[] stringArray = {"John", "Eric", "Nora", "Amy", "Frank", "Lazlo"};
        Arrays.sort(stringArray);
        System.out.println("Alphabetically sorted String array >> " + Arrays.toString(stringArray));

        //Task 3 - Use built in binarySearch methods
        System.out.println(Arrays.binarySearch(taskOne, 9));    // We can reuse taskOne Array because we sorted it in Task 2
        //Search for an element not in the Array
        System.out.println(Arrays.binarySearch(taskOne, 7));    //This returns -4 because -(insertion point) - 1 = -4 || This means -3 - 1 = -4 OR
                                                                    // If we want to know the insertion point, we move the formula around
                                                                    // -(i p) = -4 + 1 || -(i p) = -3 - Flip to positive, cant have a negative IP so the IP is 3
                                                                    // This is where '7' WOULD go
        
        //Task 4 - Use copyOf and copyOfRange
        int[] newArrOne = Arrays.copyOf(taskOne, 20);
        int[] slicedArr = Arrays.copyOfRange(taskOne, 2, 6);
        System.out.println("copyOf(original int array)  with new length of 20 will fill with 0's >> " + Arrays.toString(newArrOne));
        System.out.println("copyOfRange (original int array) to make a smaller 'substring' of the array >> " + Arrays.toString(slicedArr));

        //Task 5 - use Fill 
        int[] emptyArray = new int[5];
        System.out.println("Show empty array pre fill >> " + Arrays.toString(emptyArray));

        Arrays.fill(emptyArray, 69);
        System.out.println("Show empty array after fill >> " + Arrays.toString(emptyArray));


    }
    
}
