package OOP;

public class MethodOverloadingMain {

    public static void main(String[] args) {
        MethodOverloading bookstore = new MethodOverloading();

        // Search by title
        bookstore.searchBook("Java Programming");

        // Search by author
        bookstore.searchBookByAuthor("James Gosling");

        // Search by both title and author
        bookstore.searchBook("Java Programming", "James Gosling");
    }

}
