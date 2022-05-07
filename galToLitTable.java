public class galToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7845; //convert gallons to liters
            System.out.println(gallons + "gallons is " + liters + " liters.");
            counter++;
        }
        if (counter == 100) {
            System.out.println();
            counter = 0;//reset the line counter
        }

    }
}
