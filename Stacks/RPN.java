import java.util.*;

public class RPN {

    public static void main(String[] args) {

        // Pass a String expression into the function
        String postfixExpressionOne = "1 2 + 3 + 3 + 55 * +"; //Expected result is 30

        System.out.println("Final result from the postfix Expression = " + postfixCalculation(postfixExpressionOne));
        
    }

    public static int postfixCalculation(String expression) {

        int answer = 0;
        int firstElement, secondElement;
        char[] expArray = expression.toCharArray();
        Stack<Integer> myStack = new Stack<>();

        // System.out.println(Arrays.toString(expArray)); - Debug

        for (char ch : expArray) {

            if(ch != ' ') {

                if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                    firstElement = myStack.pop();
                    secondElement = myStack.pop();

                    switch (ch) {
                        case '+':
                            answer = firstElement + secondElement;
                            break;
                        case '-':
                            answer = firstElement - secondElement;
                            break;
                        case '*':
                            answer = firstElement * secondElement;
                            break;
                        case '/':
                            answer = firstElement / secondElement;
                            break;
                        default:
                            break;
                    }

                    myStack.push(answer);

                } else {
                    int currentNumber = Integer.parseInt(String.valueOf(ch));
                    myStack.push(currentNumber);
                }

            }
        }

        return answer;

    }
}