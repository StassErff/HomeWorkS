public class Book {
    private String appellation;
    private Author author;
    private int yearOfPublication;

    public Book(String appellation, Author author, int yearOfPublication) {
        this.appellation = appellation;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAppellation() {
        return this.appellation;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}