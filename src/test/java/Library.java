import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void returnBook(User user, Book book) {
        if(!book.isRented()) {
            book.rentBook();
            System.out.println(user.getUserName() + "rented the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + "is not rented");
        }
    }

    public void currentLibraryState() {
        System.out.println("Books");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("Users");
        for (User user : users) {
            System.out.println(user);
        }
    }

}
