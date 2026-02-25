public class LibraryManagement {

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Itroduction to Java", "John Smith");
        Book book2 = new Book("Data structure", "Alice jons");
        User user1 = new User("Lats", 1);
        User user2 = new User("Cast", 2);
        library.addBook(book1);
        library.addBook(book2);
        library.addUser(user1);
        library.addUser(user2);
        library.currentLibraryState();
        library.returnBook(user1,book1);
        library.returnBook(user2,book2);
        library.returnBook(user1,book2);
        library.currentLibraryState();
        library.returnBook(user1, book1);
        library.returnBook(user2, book2);
        library.currentLibraryState();
    }
}
