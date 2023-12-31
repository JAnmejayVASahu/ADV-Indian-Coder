import java.util.Scanner;

public class calculator {
    private static void displayResult(float num1, float num2, float result) {
        System.err.println("----------------------------------");
        System.err.println("Result: " + num1 + " + " + num2 + " = " + result);
        System.err.println("----------------------------------");
    }

    public static void main(String[] args) {
        System.err.println("Welcom to my Calculator Project, Which is given by ADV");

        /* For calculator We most need two number(number1, number2)*/
        /* Both numbers are user choices i hope float is best */
        float number1;
        char operator;
        float number2;

        /* now we take input from user */
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter the first number -> ");
        number1 = scan.nextFloat();

        System.err.print("Enter the Operator -> ");
        operator = scan.next().charAt(0);

        System.err.print("Enter the second number -> ");
        number2 = scan.nextFloat();

        switch (operator) {
            case '+':
                displayResult(number1, number2, number1 + number2);
                break;
            case '-':
                displayResult(number1, number2, number1 - number2);
                break;
            case '*':
                displayResult(number1, number2, number1 * number2);
                break;
            case '/':
                if (number2 != 0) {
                    displayResult(number1, number2, number1 / number2);
                } else {
                    System.err.println("Error: Division by zero is not allowed");
                }
                break;
            default:
            System.err.println("-----------------------");
            System.err.println("Error: Invalid operator");
            System.err.println("-----------------------");
            break;
        }

        System.err.println("Thank you for using the calculator!");
        System.err.println();
        scan.close();
    }
}