/*
Use the pythagorean theorem to find
the length of the hypotenuse given the
lengths of two opposing sides
*/
public class hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;
        /*
        sqrt() is called by the name of the class
        of which it belongs to, Math.
        */
        z = Math.sqrt(x * x + y * y);
        System.out.println(z);
    }
}
