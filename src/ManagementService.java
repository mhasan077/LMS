public class ManagementService {
    public int bookManagement(short option) {

        while (true) {
            LibraryService libServ = new LibraryService();

            switch (option) {
                case 0:
                    System.exit(-1);
                case 1:
                    libServ.registerBooks();
                    break;
                case 2:
                    libServ.getListOfBooks();
                    break;
                case 3:
                    libServ.getBookInfo();
                    break;
                case 4:
                    managementSystem();
                    break;
            }
            return 0;
        }
    }


    private int managementSystem() {
            while (true){

                MenuService menuService = new MenuService();
                short option = menuService.entryProject();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        bookManagement(menuService.LibraryService());
                        break;
                    default:
                        System.out.println("Invalid option");
                }

                return 0;
            }
        }
}
