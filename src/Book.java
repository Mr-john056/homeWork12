public class Book {
    Author authorName;
    Author bookName;
    int publishingYear;

    public Book(Author authorName, Author bookName, int publishingYear){
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;

    }
    private Author getAuthorName() {
        return authorName;
    }

    private Author getBookName() {

        return bookName;
    }

    private int getPublishingYear() {
        return publishingYear;
    }

    private void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
