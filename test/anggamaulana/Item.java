/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anggamaulana;

/**
 *
 * @author Angga Maulana A
 */
public class Item {
    private String name;
    private String harga;
    private String jumlah;

    public Item(String name, String harga, String jumlah) {
        this.name = name;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
} 
