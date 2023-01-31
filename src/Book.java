public class Book {
    private String title;
    private Author Author;
    private int year;

    public Book(String title, Author AuthorBook, int year) {
        this.title = title;
        this.Author = AuthorBook;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}