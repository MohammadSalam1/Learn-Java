public class shortCircuitOps {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of: " + n);

        }

        d = 0; //setting d to zero

        if (d != 0 && (n % d) == 0) {
            //since d is zero then the second operand is not valid.
            System.out.println(d + " is a factor of: " + n);
        }
        if (d != 0 & (n % d) == 0) {
            System.out.println(d + " is a factor of: " + n);
        }
    }
}
