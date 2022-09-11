import java.io.IOException;

public class nonStopForLoop {
    public static void main(String[] args) throws IOException {
        //this for loop won't stop unless you press S;

        int i;
        System.out.println("Press S to stop.");
        System.out.println();

        for(i = 0; (char) System.in.read() != 'S'; i++) //Has to be capital letter S;
        System.out.println("Pass #" + i);
    }
}
