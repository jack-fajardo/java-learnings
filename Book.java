
public class Book {

    private String title;
    private String author;
    private boolean isBorrowed = false;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void markAsBorrowed() {
        this.isBorrowed = true;
    }

    public Boolean isBorrowed() {
        return this.isBorrowed;
    }
}
