import java.util.Arrays;
import java.util.Stack; // Stack collection import

public class Stacks {

    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();    //Declare a new stack of type integer

        // Task 1 - Create a Stack of ints, Push pop and print until the stack is empty
        intStack.push(10);
        intStack.push(11);
        intStack.push(12);

        //Display the stack
        System.out.println("Printing Stack: " + intStack);

        // Use the isEmpty built in method to iterate over the Stack
        while (!intStack.isEmpty()) {
            System.out.println("Popped Element: " + intStack.pop());
        }

        //Display the stack after popping all elements
        System.out.println("Printing Stack: " + intStack);

        // Task 2 - Use pop peek push and isEmpty with a different data type & Create a Function using a stack to reverse an int array
        Stack<String> stringStack = new Stack<>();

        stringStack.push("This");
        stringStack.push("is");
        stringStack.push("a");
        stringStack.push("string");
        stringStack.push("stack");

        System.out.println("Printing out the full stack : " + stringStack);
        System.out.println("Peeking at the top element : " + stringStack.peek());

        while (!stringStack.isEmpty()) {
            System.out.println("Popping element : " + stringStack.pop());
        }

        int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Reversing array using a stack : " + Arrays.toString(reverseArray(testArray)));

        
    }

    public static int[] reverseArray(int[] arr) {

        int[] reversedArray = new int[arr.length];
        Stack<Integer> placeholder = new Stack<>();

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            placeholder.push(arr[i]);
        }

        while(!placeholder.isEmpty()) {

            reversedArray[counter] = placeholder.pop();

            counter++;

        }

        return reversedArray;

    }
    
}
