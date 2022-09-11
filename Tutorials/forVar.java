//declaring loop control variables inside the loop;
public class forVar {
    public static void main(String[] args) {

        int sum = 0;
        int fact = 1;

        //compute the factorial of the number through 5
        for (int i = 1; i <= 5; i++) { //declare variable inside the loop body

            sum += i; //i is known throughout the loop
            fact *= i;

        }
        //i is not known here (outside the for loop body)
        System.out.println("Sum is: " + sum);
        System.out.println("factorial is: " + fact);

    }
}
