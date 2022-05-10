public class boolType {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is: " + b);

        b = true;
        System.out.println("b now is: " + b);

        //boolean value can be used to control if statement
        if (b) {
            System.out.println("this is executed");
        }

        b = false;
        if (b) {
            System.out.println("this is not executed");
        }

        //outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is: " + (10 > 9));
    }
}
