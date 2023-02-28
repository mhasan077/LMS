public class Book {
    private String name;
    private String author;
    private String genre;
    private String numberOfPages;
    private String language;
    private int price;
    private int count;
    private int stockStatus;

    public Book(String name, String author, String genre, int numberOfPages, String language, int price, int count, int stockStatus) {
        this.name = this.name;
        this.author = this.author;
        this.genre = this.genre;
        this.numberOfPages = this.numberOfPages;
        this.language = this.language;
        this.price = this.price;
        this.count = this.count;
        this.stockStatus = this.stockStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(int stockStatus) {
        this.stockStatus = stockStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public String toString2() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
