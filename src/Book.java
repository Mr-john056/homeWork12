public class Book {
    Author authorName;
    Author bookName;
    int publishingYear;


    public Book(Author authorName, Author bookName, int PublishingYear) {
    this.authorName = authorName;
    this.bookName = bookName;
    this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {

        return authorName;
    }

    public Author getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}