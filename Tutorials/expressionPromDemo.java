public class expressionPromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b;//no cast needed; because results automatically elevated to int

        b = 10;
        b = (byte) (b * b); //cast needed to assign an int to a byte.
        System.out.println("i and b: " + i + " " + b);
    }
}
