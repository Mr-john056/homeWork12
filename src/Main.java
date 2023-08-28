import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев", "Толстой");
        Book book = new Book();
        Book book1 = new Book();
        System.out.println(book);
        System.out.println(book1);


    }

    public void setPublishingYear() {
        int publishingYear = 1897;
        this.setPublishingYear();
    }
}
