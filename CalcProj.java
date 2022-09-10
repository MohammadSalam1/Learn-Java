//let's learn to make a calculator

import java.util.*;

public class CalcProj {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        char operator;
        double results = 0.0;

        //allows user input
        Scanner calc = new Scanner(System.in);

        //user input here. 1st number, 2nd number and what operator to use
        System.out.print("Please enter a number ");
        num1 = calc.nextInt();
        System.out.print("Please enter a number ");
        num2 = calc.nextInt();
        System.out.print("Please use an operator ");
        operator = calc.next().charAt(0);

        //operator usage
        switch (operator) {
            case '+':
                results = num1 + num2;
                break;
            case '-':
                results = num1 - num2;
                break;
            case '*':
                results = num1 * num2;
                break;
            case'/':
                results = num1 / num2;
                break;
        }

        System.out.println();



    }
}
