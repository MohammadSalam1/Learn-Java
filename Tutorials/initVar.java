//different ways to initialize a variable
public class initVar {
    public static void main(String[] args) {
        /*
        This is called initializing variables
        */

        //one way is to declare it then assign value to it
        int num;
        num = 2;

        //or you can assign value on the same line, that's called initialization
        int age = 3;

        //you can declare and assign values to many vars on one line
        int a, b = 3, c = 4, d;

        //there is also dynamic initialization
        double radius = 4, height = 5;
        double volume = 3.1416 * radius * radius * height;
        /*
        the value of volume will show
        after the program is run
        it uses other variables such as radius and height
        */
        System.out.println("The volume is " + volume);
    }
}
