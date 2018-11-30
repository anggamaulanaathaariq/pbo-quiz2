package anggamaulana;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angga Maulana A
 */
class Transaksi {
    //Atribut Class Transaksi:
    private double subTotal = 0;
    private double detailBarang;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Transaksi (){
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
    }
    //Method Perhitungan barang
    public double countsubTotal(){
        subTotal = 0;
        for (int i =0;i<tabel.getRowCount();i++){
//            Double subTotal = Double.parseDouble(tabel.getValueAt(i, 1).toString());
            subTotal=subTotal + Double.parseDouble(tabel.getValueAt(i, 1).toString()) * Double.parseDouble(tabel.getValueAt(i, 2).toString());
        }
        return subTotal;
    }
    //Method Detail Barang/Output Hasil
    public String detailBarang(){
        String detailBarang = "";
        for (int i =0;i<tabel.getRowCount();i++){
              detailBarang += tabel.getValueAt(i, 0).toString() + " " + tabel.getValueAt(i, 2).toString() + 
                      " " + (Double.parseDouble(tabel.getValueAt(i, 1).toString()) * Double.parseDouble(tabel.getValueAt(i, 2).toString())) + "\n";
        }
        return detailBarang;
    }
    
    //Gether & Setter Dari Class Transaksi / Atribut
    public double getDetailBarang() {
        return detailBarang;
    }

    public void setDetailBarang(double detailBarang) {
        this.detailBarang = detailBarang;
    }
    
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
    }
       
