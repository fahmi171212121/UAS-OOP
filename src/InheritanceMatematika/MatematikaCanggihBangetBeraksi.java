/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author myxps
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget matematikaCanggihBanget = new MatematikaCanggihBanget();
        
        int hasilPertambahan = matematikaCanggihBanget.pertambahan(30, 17);
        System.out.println("Hasil Pertambahan: " + hasilPertambahan);
        
        int hasilPerkalian = matematikaCanggihBanget.perkalian(3, 45);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        
        int hasilModulus = matematikaCanggihBanget.modulus(60, 6);
        System.out.println("Hasil Modulus: " + hasilModulus);
        
        int hasilPertambahanTiga = matematikaCanggihBanget.pertambahanTiga(40, 7, 8);
        System.out.println("Hasil Pertambahan Tiga: " + hasilPertambahanTiga);
    }
}
