package model;

public class Minuman extends Menu {

    public Minuman(String nama, int harga) {
        super(nama, harga);
    }
    
    @Override
    public String getInfo() {
        return "[Minuman] " + getNama() + " - Rp" + getHarga();
    }
}