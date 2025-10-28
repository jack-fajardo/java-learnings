
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("The legend of Zelda");
        book1.setAuthor("Link");

        Book book2 = new Book();
        book2.setTitle("Super Mario");
        book2.setAuthor("Mario");

        Library library = new Library();
        library.addBooks(book1);
        library.addBooks(book2);

        library.borrowBook("Super Mario");

        Book foundBook = library.findBookByTitle("Super Mario");

        if (foundBook != null) {
            System.out.println("Book Found");
        } else {
            System.out.println("Book Not Found");
        }

        Member member = new Member();
        member.register("Jack", 35);
        System.out.println(member.getName());
    }
}
