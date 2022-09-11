import java.io.IOException;

//guess the letter game
public class guessingGame {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'k';

        System.out.println("I'm thinking of a letter between A and Z");
        System.out.print("Can you guess it? ");

        ch = (char) System.in.read(); //get a char
        if (ch == answer) {
            System.out.println("** RIGHT **"); //it's case-sensitive.
        } else {
            System.out.println("Sadly you're wrong!");
        }

    }
}
