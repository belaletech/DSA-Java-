//4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
//        (Use if conditions)
package KunalAssignment1;
import java.util.Scanner;
public class Prob4Calculator {
    public static void main(String[] args) throws ArithmeticException {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        char operator=sc.next().charAt(0);
try {
        switch (operator) {
            case '+':
                System.out.println("sum" + (a + b));
                break;
            case '-':
                System.out.println("diff" + (a - b));
                break;
            case '*':
                System.out.println("Multiply " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                System.out.println("Divide: " + (a / b));
                System.out.println("Hacked");
            default:
                System.out.println("Invalid operator");
                break;
        }
      }catch (ArithmeticException e){
    System.out.println(e.getMessage());
}
    }
}
