public class if_else_Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 6; x++) {
            if (x == 1) {
                System.out.println("X is one");
            } else if (x == 2) {
                System.out.println("X is two");
            } else if (x == 3) {
                System.out.println("X is three");
            } else if (x == 4) {
                System.out.println("X is four");
            } else {
                System.out.println("X is not between one and four"); //this is the default statement encase none of the
                                                                    //above was true.
            }
        }
    }
}
