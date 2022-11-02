package BookStoreProj;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public void bookLibrary() {

        ArrayList<String> books = new ArrayList<String>();
        Scanner bookChoice = new Scanner(System.in);
        Scanner newBook = new Scanner(System.in);

        //books list
        books.add("His Last Bow");
        books.add("The Return Of Sherlock Holmes");
        books.add("Crime and Punishment");
        books.add("Letters of Stoic");
        books.add("Assault on Intelligence");


        //User choosing one of the books
        System.out.println("Choose your favourite book:\n" + books);
        String bookName = bookChoice.nextLine(); //allows user to choose from the list
        System.out.println();
        System.out.println("The book you chose is: " + bookName); //prints user choice
        books.remove(bookName); // remove the chosen book from the list
        System.out.println("The Remaining books are:\n" + books);

        //adding new book to the array
        System.out.println("What books did you bring in?");
        String addBook = newBook.nextLine();
        System.out.println("the new list of books are:\n" + books.add(addBook));

    }
}
