
/*Program to swap two numbers without using third variable */
import java.util.*;

class check {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number:");
        num1 = sc.nextInt();

        System.out.print("enter a number:");
        num2 = sc.nextInt();

        System.out.print("Before swapping");
        System.out.printf("\n1.%d", num1);
        System.out.printf("\n2.%d", num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print("\nAfter swapping");
        System.out.printf("\n1.%d", num1);
        System.out.printf("\n2.%d", num2);

    }
}
