package anggamaulana;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angga Maulana A
 */
class Transaksi {
    private double subTotal = 0;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Transaksi (){
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Jumlah");
    }
    public double countsubTotal(){
        subTotal = 0;
        for (int i =0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 2).toString());
        }
        return subTotal;
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
       
