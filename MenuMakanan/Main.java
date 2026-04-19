import model.Makanan;
import model.Minuman;
import model.Dessert;
import model.Menu;
import view.MenuView;
import controller.MenuController;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu[] daftarMenu = new Menu[25];

        // Makanan
        daftarMenu[0] = new Makanan("Nasi Goreng", 15000);
        daftarMenu[1] = new Makanan("Sate Ayam", 20000);
        daftarMenu[2] = new Makanan("Mie Goreng", 13000);
        daftarMenu[3] = new Makanan("Ayam Geprek", 18000);
        daftarMenu[4] = new Makanan("Bakso", 15000);
        daftarMenu[5] = new Makanan("Soto Ayam", 16000);
        daftarMenu[6] = new Makanan("Nasi Pecel", 12000);
        daftarMenu[7] = new Makanan("Rendang", 25000);

        // Minuman
        daftarMenu[8] = new Minuman("Es Teh", 5000);
        daftarMenu[9] = new Minuman("Es Jeruk", 7000);
        daftarMenu[10] = new Minuman("Kopi Hitam", 8000);
        daftarMenu[11] = new Minuman("Jus Alpukat", 12000);
        daftarMenu[12] = new Minuman("Jus Mangga", 11000);
        daftarMenu[13] = new Minuman("Teh Tarik", 9000);

        // Dessert
        daftarMenu[14] = new Dessert("Ice Cream Vanilla", 10000);
        daftarMenu[15] = new Dessert("Ice Cream Chocolate", 10000);
        daftarMenu[16] = new Dessert("Pudding Coklat", 8000);
        daftarMenu[17] = new Dessert("Cheese Cake", 15000);
        daftarMenu[18] = new Dessert("Brownies", 12000);
        daftarMenu[19] = new Dessert("Donat Coklat", 7000);
        daftarMenu[20] = new Dessert("Donat Strawberry", 7000);
        daftarMenu[21] = new Dessert("Pancake", 13000);
        daftarMenu[22] = new Dessert("Waffle", 14000);
        daftarMenu[23] = new Dessert("Tiramisu", 16000);
        daftarMenu[24] = new Dessert("Mochi Ice Cream", 15000);

        MenuView view = new MenuView();
        MenuController controller = new MenuController(daftarMenu, view);
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {

            System.out.println("\n╔════════════════════════════════════════════╗");
            System.out.println("║            SISTEM MENU RESTORAN            ║");
            System.out.println("║                JAVA MVC                    ║");
            System.out.println("╠════════════════════════════════════════════╣");
            System.out.println("║ 1. Tampilkan Semua Menu                    ║");
            System.out.println("║ 2. Tampilkan Menu Makanan                  ║");
            System.out.println("║ 3. Tampilkan Menu Minuman                  ║");
            System.out.println("║ 4. Tampilkan Menu Dessert                  ║");
            System.out.println("║ 5. Urutkan Menu Berdasarkan Harga          ║");
            System.out.println("║ 6. Cari Menu                               ║");
            System.out.println("║ 7. Keluar                                  ║");
            System.out.println("╠════════════════════════════════════════════╣");
            System.out.println("║  Dibuat oleh : M. Alvin Firmansyah         ║");
            System.out.println("║  NIM : 25051204401                         ║");
            System.out.println("╚════════════════════════════════════════════╝");

            System.out.print("Masukkan pilihan : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    controller.tampilkanMenu();
                    break;

                case 2:
                    controller.tampilkanMakanan();
                    break;

                case 3:
                    controller.tampilkanMinuman();
                    break;

                case 4:
                    controller.tampilkanDessert();
                    break;

                case 5:
                    controller.sortHarga();
                    controller.tampilkanMenu();
                    break;

                case 6:
                    System.out.print("Masukkan nama menu : ");
                    String nama = input.nextLine();
                    controller.cariDanTampilkan(nama);
                    break;

                case 7:
                    System.out.println("\nTerima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 7);
    }
}