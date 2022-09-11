public class sqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr; //num = number, sroot = squareRoot, rerr = rounding error;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("square root of " + num + "is " + sroot);

            //compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("roudning error is: " + rerr);
            System.out.println();
        }

    }
}
