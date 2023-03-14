class Con_Overloading {
    String name;
    int num;
    int num1;

    Con_Overloading(int qty, String pname, int price) {
        name = pname;
        num = qty;
        num1 = price;
    }

    Con_Overloading(int q, String p1name) {
        name = p1name;
        num1 = q;
        num = num1 / 10;
    }

    Con_Overloading(String prodname, int prodprice) {
        name = prodname;
        num1 = (int) (prodprice - (0.1));
    }

    void display() {
        System.out.println("Product Name:" + name);

        System.out.println("Quantity:" + num);

        System.out.println("Price:" + num1);
    }

    public static void main(String[] args) {
        Con_Overloading pr = new Con_Overloading("pineapple", 50);
        Con_Overloading pr1 = new Con_Overloading(150, "orange");

        pr.display();
        pr1.display();

    }

}
