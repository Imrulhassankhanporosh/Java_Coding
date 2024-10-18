package OOP;

class MethodOverloading {

    // Method to search by title
    public void searchBook(String title) {
        System.out.println("Searching for book by title: " + title);
    }

    // Method to search by author
    public void searchBookByAuthor(String author) {
        System.out.println("Searching for books by author: " + author);
    }

    // Method to search by both title and author
    public void searchBook(String title, String author) {
        System.out.println("Searching for book titled '" + title + "' by author: " + author);
    }
}
