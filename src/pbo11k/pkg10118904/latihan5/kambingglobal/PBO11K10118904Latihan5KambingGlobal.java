/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan5.kambingglobal;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk membuat class global
 */
public class PBO11K10118904Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    KambingGlobal kambingSusu = new KambingGlobal();
    
    // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
    kambingSusu.getJumlahKambing();
    
    // Menambah satu kambing
    kambingSusu.tambahKambing();
    
    // Menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();
    }
    
}
