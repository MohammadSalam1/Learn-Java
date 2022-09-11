/*
program to show how if statement works
*/
class ifDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) {
            System.out.println("a is lesser than b");
        } // since this is a true statement it'll be executed

        if (a == b) {
            System.out.println("you won't see this");
        } // this statement is false so the program will bypass it.

        System.out.println();

        c = a - b; //c = -1
        System.out.println("C is equal to -1");
        if (c >= 0) {
            System.out.println("c is non negative");
        }// this statement will be ignored.
        if (c < 0) {
            System.out.println("c is negative");
        } //c is -1 so this will be printed

        System.out.println(); //adds blank line between statements

        c = b - a; //c now = 1
        System.out.println("c is equal to 1");
        if (c >= 0) {
            System.out.println("c is non negative");
        } //this statement will be printed because the condition is true.
        if (c < 0) {
            System.out.println("c is negative");
        } //won't be printed because it's false

    }
}
