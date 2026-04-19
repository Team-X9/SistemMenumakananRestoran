package model;

public class Dessert extends Menu {

    public Dessert(String nama, int harga) {
        super(nama, harga);
    }
    
    @Override
    public String getInfo() {
        return "[Dessert] " + getNama() + " - Rp" + getHarga();
    }
}