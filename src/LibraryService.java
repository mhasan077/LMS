import java.util.Scanner;

public class LibraryService {
    public boolean registerBooks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the books");
        int n = sc.nextInt();
        GlobalData.bookArr = new Book[n];
        for (int i = 0; i < n; i++) {
            GlobalData.bookArr[i] = fillBooks();
        }
        return true;
    }

    public Book fillBooks(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the name of the book");
        String name = sc.next();
        System.out.println("Enter the author of the book");
        String author = sc.next();
        System.out.println("Enter the genre of the book");
        String genre = sc.next();
        System.out.println("Enter the number of pages of the book");
        int numberOfPages = sc.nextInt();
        System.out.println("Enter the language of the book");
        String language = sc.next();
        System.out.println("Price of the book");
        int price = sc.nextInt();
        System.out.println("Count of the book");
        int count = sc.nextInt();
        System.out.println("Stock status of the book");
        int stockStatus = sc.nextInt();

        return new Book(name, author, genre, numberOfPages, language, price, count, stockStatus);
    }

    public void getListOfBooks(){
        for (int i = 0; i < GlobalData.bookArr.length; i++) {
            System.out.println("-----------------");
            System.out.println(i+1 + ".Book");
            System.out.println(GlobalData.bookArr[i].toString());
            System.out.println("-----------------");
        }
    }

    public void getBookInfo(){

    }
}
