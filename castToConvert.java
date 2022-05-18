public class castToConvert {
    public static void main(String[] args) {

        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); //cast double to int
        System.out.println("integer outcome of x/y is: " + i);

        i = 100;
        b = (byte) (i);//no info lost because byte can hold a value of 100
        System.out.println("value of b is: " + b);

        i = 257;
        b = (byte) (i);//information lost, the value 257 is too big for a byte
        System.out.println("value of b now is: " + b);

        b = 88;
        ch = (char) (b); //these are incompatible types
        System.out.println("ch is: " + ch);

    }
}
