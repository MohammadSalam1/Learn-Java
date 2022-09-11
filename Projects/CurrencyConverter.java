//Currency converter

import java.util.*;
import java.text.*;

public class CurrencyConverter {
    public static void main(String[] args) {

        double amount, pound, sek, code;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Which currency would you like to convert to?");

        System.out.println("1: Pound \t 2: SEK");
        code = sc.nextInt();

        System.out.println("How much money would you like to convert?");
        amount = sc.nextFloat();

        //amount conversion
        if (code == 1) {

            pound = amount * 12;
            System.out.println("Your " + amount + " pound is: " + f.format(pound) + " sek");


        } else if (code == 2) {
            //from sek to pound

            sek = amount / 12;
            System.out.println("Your " + amount + " sek is: " + f.format(sek) + " pound");


        } else {
            System.out.println("Invalid Input");
        }
        System.out.println();
        System.out.println("Thanks for using our conversion app!");


    }
}
