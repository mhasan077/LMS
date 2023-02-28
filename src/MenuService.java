import java.util.Scanner;

public class MenuService {

    public short entryProject(){
        System.out.println(
                "------- Library Management Service -----\n"
                        + "[0] Exit program\n"
                        + "[1] Library management\n"
        );

        System.out.println(("Choose option"));
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        return n;
    }

    public short LibraryService(){
        System.out.println(
                "------ Book Management System ------\n"
                        + "[0] Exit program\n"
                        + "[1] Register a Book\n"
                        + "[2] Show Books\n"
                        + "[3] Get Detailed Information About Selected Book\n"
        );
        System.out.println(("Choose option"));
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        return n;
    }
}
