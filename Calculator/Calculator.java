import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter first number: ");
            float a = sc.nextInt();

            System.out.print("Enter second number: ");
            float b = sc.nextInt();

            System.out.print("choose operation:( + , - , * , / ):==> ");
            char op = sc.next().charAt(0);
            if (op == '+') {
                System.out.println("sum=" + (a + b));
            } else if (op == '-') {
                System.out.println("Difference= " + (a - b));
            } else if (op == '*') {
                System.out.println("Multiplication= " + (a * b));
            } else if (op == '/') {

                if (b != 0) {
                    System.out.println("Division= " + (a / b));
                } else {
                    System.out.println("Error:Can't divide by zero");
                }
            } else {
                System.out.println("Invalid Operator");
            }

            System.out.println("Are want to continue?(Y or N)");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
}