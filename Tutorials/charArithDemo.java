/*
following the ASCII table, the char will be defined
it started with x, then it was incremented by 1 which on the ASCII table is y
then it was assigned the value of 90 with translates to Z
*/

public class charArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'x';
        System.out.println("ch contains: " + ch);

        ch++; //char can be incremented
        System.out.println("ch is now: " + ch);

        ch = 90; //it can be also assign an integer value
        System.out.println("ch is now: " + ch);
    }
}
