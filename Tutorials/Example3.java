/*
        this program will illustrates the differnce
        between int and double
        */

class Example3 {
    public static void main(String[] args) {
        int v; // int variable
        double x; //floating-point (double) variable

        v = 10; //assigning value for int v
        x = 10.0; //assigning value for double x

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);
        System.out.println(); // just to print a blank line in between

        v = v / 4;
        x = x / 4;

        System.out.println("V value after division: " + v);
        System.out.println("X value after division: " + x);
    }
}
