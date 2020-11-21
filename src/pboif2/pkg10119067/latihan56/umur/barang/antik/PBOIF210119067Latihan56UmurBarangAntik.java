  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan56.umur.barang.antik;

/**
 *
 * @author Danhago
 * NAMA     : Andreas Danhago
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi: Barang Antik
 */
public class PBOIF210119067Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampillUmur();
    }
    
}
