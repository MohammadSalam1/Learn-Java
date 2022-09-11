/*
The moon gravity is about 17 percent that of earth's.
Write a program that computes your effective weight on the moon*/
public class testOne {
    public static void main(String[] args) {
        double earthWeight, moonWeight;
        earthWeight = 80;

        moonWeight = earthWeight * 0.17;

        System.out.println("my weight on the moon is: " + moonWeight + " kgs");


    }
}
