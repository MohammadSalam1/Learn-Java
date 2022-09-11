import java.io.*;

class keybRead {
    public static void main(String[] args) throws IOException {

            char ch;

            System.out.println("press a key followed by ENTER: ");

            ch = (char) System.in.read(); //read the character pressed on the keyboard.

            System.out.println("your key is: " + ch);

    }
}
