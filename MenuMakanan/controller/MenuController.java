package controller;

import model.Menu;
import view.MenuView;
import java.util.Arrays;
import java.util.Comparator;

public class MenuController {

    private Menu[] daftarMenu;
    private MenuView view;

    public MenuController(Menu[] daftarMenu, MenuView view) {
        this.daftarMenu = daftarMenu;
        this.view = view;
    }

    public void tampilkanMenu() {
        view.tampilkanMenu(daftarMenu);
    }

    // Searching
    public Menu cariMenu(String nama) {
        for (Menu m : daftarMenu) {
            if (m.getNama().equalsIgnoreCase(nama)) {
                return m;
            }
        }
        return null;
    }

    public void cariDanTampilkan(String nama) {
        Menu hasil = cariMenu(nama);
        view.tampilkanHasilCari(hasil);
    }

    // Sorting berdasarkan harga
    public void sortHarga() {
        Arrays.sort(daftarMenu, new Comparator<Menu>() {
            public int compare(Menu o1, Menu o2) {
                return o1.getHarga() - o2.getHarga();
            }
        });
        view.pesan("Menu berhasil diurutkan berdasarkan harga.");
    }

    public void tampilkanMakanan() {
        System.out.println("\n=== MENU MAKANAN ===");
        for (Menu m : daftarMenu) {
            if (m instanceof model.Makanan) {
                System.out.println(m.getInfo());
            }
        }
    }

    public void tampilkanMinuman() {
        System.out.println("\n=== MENU MINUMAN ===");
        for (Menu m : daftarMenu) {
            if (m instanceof model.Minuman) {
                System.out.println(m.getInfo());
            }
        }
    }

    public void tampilkanDessert() {
        System.out.println("\n=== MENU DESSERT ===");
        for (Menu m : daftarMenu) {
            if (m instanceof model.Dessert) {
                System.out.println(m.getInfo());
            }
        }
    }
}