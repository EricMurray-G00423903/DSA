import java.util.*;

public class CheckParentheses {
    
    public static void main(String[] args) {

        // Test Cases 
        String testOne = "([{My String}])"; //Expected True
        String testTwo = "{(My Second]}";   //Expected False
        String testThree = "(Last String)"; //Expected True

        System.out.println(isBalanced(testOne));
        System.out.println(isBalanced(testTwo));
        System.out.println(isBalanced(testThree));
        
    }

    public static boolean isBalanced(String stringToCheck) {

        // Create a new Stack for the characters
        Stack<Character> charStack = new Stack<>();

        // Use a foreach to loop over the passed String - converting it to a char array
        for (char ch : stringToCheck.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {   // Detect opening bracket

                charStack.push(ch);     // If the char is an opening bracket then add it to the stack 

            }

            if(ch == ')' || ch == '}' || ch == ']') {   // Detect closing bracket
                if(charStack.isEmpty()) return false;   // Check to see if the stack is empty if it hits a closing bracket

                if(ch == ')') {
                    if(charStack.pop() != '(') return false;
                }
                if(ch == '}') {
                    if(charStack.pop() != '{') return false;
                }
                if(ch == ']') {
                    if(charStack.pop() != '[') return false;
                }
                
            }

        }

        return true;    // If the program reaches here then it must be true
    }
}
