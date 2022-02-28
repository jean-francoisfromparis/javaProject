// import java.util.*;
// import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        Book leSeigneurDesAnneaux = new App().new Book("le Seigneur Des Anneaux", "Tolkien", 500,  "jfl");

        System.out.println(leSeigneurDesAnneaux.title);
    }

    class Book{
        String title;

        String author;

        int numberOfPages;

        String editor;

        Book(String title, String author, int numberOfPages, String editor){
            this.title = title;

            this.author = author;

            this.numberOfPages = numberOfPages;

            this.editor = editor;

        }
    }


}
