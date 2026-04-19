package view;

import model.Menu;

public class MenuView {

    public void tampilkanMenu(Menu[] daftarMenu) {
        System.out.println("\n===== DAFTAR MENU =====");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i + 1) + ". " + daftarMenu[i].getInfo());
        }
    }

    public void tampilkanHasilCari(Menu menu) {
        if (menu != null) {
            System.out.println("Menu ditemukan: " + menu.getInfo());
        } else {
            System.out.println("Menu tidak ditemukan.");
        }
    }

    public void pesan(String pesan) {
        System.out.println(pesan);
    }
}