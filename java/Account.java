import java.util.*;

public class Account {

    int Id;
    String name;
    double cost;

    void product(int x) {

        this.Id = x;
        System.out.print("product Id:" + x);
    }

    void product(String n, double y) {
        this.name = n;
        this.cost = y;
        System.out.printf("\nname:%s", n);
        System.out.printf("\ncost=%f", y);
    }

    public static void main(String args[]) {

        Scanner s1 = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = s1.nextInt();
        System.out.print("enter n: ");
        String n = s1.next();
        System.out.print("enter y: ");
        double y = s1.nextDouble();

        Account ac = new Account();
        ac.product(x);
        ac.product(n, y);

    }

}