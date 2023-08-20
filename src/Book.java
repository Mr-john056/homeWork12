public class Book {
    String authorName;
    String bookName;
    int publishingYear;


    public Book(String authorName, String bookName, int PublishingYear) {
    this.authorName = authorName;
    this.bookName = bookName;
    this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}