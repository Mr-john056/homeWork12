public class Main {
    public static void main(String[] args) {

        Author author = new Author("Александр", "Пушкин");
        Book book = new Book("Пушкин", "Русалка",1832);
        String authorName = book.getAuthorName();
        System.out.println(author.getName());
    }
}

