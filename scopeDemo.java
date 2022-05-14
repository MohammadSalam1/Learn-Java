//demonstrating block scope
public class scopeDemo {
    public static void main(String[] args) {

        int x;//known to all code within main
        x = 10;

        if (x == 10) {//start new scope

            int y = 20;//known only to this block

            //x and y both know each other
            x = y * 2;
        }
        //y = 100. ERROR y isn't known in main. it's outside its own scope

        //x is known here
        System.out.println("x is: " + x);

    }
}
