package anggamaulana;

import javax.swing.JComboBox;

/**
 *
 * @author Angga Maulana A
 */
public class Item {
    private String name;
    private double harga;
    private String jumlah;

    public Item(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }
    
    @Override
            public String toString(){
                return this.name;
            }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    JComboBox createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
