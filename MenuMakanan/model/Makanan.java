package model;

public class Makanan extends Menu {

    public Makanan(String nama, int harga) {
        super(nama, harga);
    }
    
    @Override
    public String getInfo() {
        return "[Makanan] " + getNama() + " - Rp" + getHarga();
    }
}