//Currency converter
import java.util.*;
import java.text.*;

public class CurrencyConverter {
    public static void main(String[] args) {

        double amount, dollar, sek, code;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Which currency would you like to convert to?");

        System.out.println("1: Dollar \t 2: SEK");
        code = sc.nextInt();

        System.out.println("How much money would you like to convert?");
        amount = sc.nextFloat();

        if (code == 1){
            
        }



    }
}
