import java.io.IOException;

public class guessNestedif {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'k';
        System.out.println("I'm thinking of a letter between A and Z!");
        System.out.print("Can you guess what is it? ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("You are Correct!");
        } else {
            System.out.print("Sorry, you're ");
            if (ch < answer) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        }
    }
}
