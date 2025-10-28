
import java.util.List;
import java.util.ArrayList;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBooks(Book book) {
        this.books.add(book);
    }

    public void printAllBooks() {
        for (Book book : this.books) {
            System.out.println(
                    book.getTitle()
                    + " By: "
                    + book.getAuthor()
                    + " -- Borrowed? "
                    + book.isBorrowed()
            );
        }
    }

    public void borrowBook(String title) {
        for (Book book : this.books) {
            if (title.equals(book.getTitle())) {
                book.markAsBorrowed();
                break;
            }
        }
    }

    public void printBorrowedBooks() {
        for (Book book : this.books) {
            if (book.isBorrowed()) {
                System.out.println(
                        book.getTitle()
                        + " By: "
                        + book.getAuthor()
                        + " -- Borrowed? "
                        + book.isBorrowed()
                );
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (title.equals(book.getTitle())) {
                return book;
            }
        }
        return null;
    }
}
