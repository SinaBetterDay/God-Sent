import java.util.Scanner;

public class PostfixEvaluator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nGive me an expression: ");
        String input = scnr.nextLine(); //Take input

        char[] stack = new char[100]; //Stack for operators
        int stackTop = -1;

        int[] output = new int[100]; //Stack for operands (Display)
        int outputHead = -1;

        StringBuilder postfix = new StringBuilder(); //Postfix expression

        //Convert infix to postfix
        for (int i = 0; i < input.length(); i++) {  //Iterate through input
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                postfix.append(ch); 
            } else if (ch == '(') {
                stack[++stackTop] = ch;
            } else if (ch == ')') {
                while (stackTop >= 0 && stack[stackTop] != '(') { 
                    postfix.append(stack[stackTop--]);
                }
                stackTop--; //Pop '('
            } else {
                while (stackTop >= 0 && stack[stackTop] != '(') {
                    char topOp = stack[stackTop];

                    //Precedence checks
                    if ((ch == '+' || ch == '-') && (topOp == '*' || topOp == '/' || topOp == '^')) {
                        postfix.append(stack[stackTop--]);
                    } else if ((ch == '*' || ch == '/') && topOp == '^') {
                        postfix.append(stack[stackTop--]); 
                    } else {
                        break;
                    }
                }
                stack[++stackTop] = ch;
            }
        }

        // Display remaining operators
        while (stackTop >= 0) {
            postfix.append(stack[stackTop--]);
        }

        System.out.println("Postfix expression: " + postfix);

        // Evaluate postfix
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                output[++outputHead] = ch - '0';
            } else {
                int b = output[outputHead--];
                int a = output[outputHead--];
                switch (ch) {
                    case '+':
                        output[++outputHead] = a + b;
                        break;
                    case '-':
                        output[++outputHead] = a - b;
                        break;
                    case '*':
                        output[++outputHead] = a * b;
                        break;
                    case '/':
                        output[++outputHead] = a / b;
                        break;
                    case '^':
                        output[++outputHead] = (int) Math.pow(a, b);
                        break;
                }
            }
        }

        System.out.println("Answer: " + output[outputHead]);
    }
}