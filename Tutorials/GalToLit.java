//program to convert gallons to liters
class GalToLit {
    public static void main(String[] args) {
        /*every gallon holds 3.7854 liters in it
        to convert gallon to liter
        you have to multiply whatever number inserted by 3.7854
        */
        double gallon;
        double liter;

        gallon = 10;
        liter = gallon * 3.7854;

        System.out.println("10 gallons is " + liter + " liters");
    }
}
