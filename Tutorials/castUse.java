public class castUse {
    public static void main(String[] args) {

        int i;

        for (i = 0; i < 5; i++){

            System.out.println(i + " / 3 = " + i / 3);
            System.out.println(i + " / 3 with fraction = " + (double) i / 3);
            //only i will be turned to a double. since it's not in a parenthesis.
            System.out.println();
        }

    }
}
