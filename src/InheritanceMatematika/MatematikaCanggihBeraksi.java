/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceMatematika;

/**
 *
 * @author myxps
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();
        
        int hasilPertambahan = matematikaCanggih.pertambahan(60, 20);
        System.out.println("Hasil Pertambahan: " + hasilPertambahan);
        
        int hasilPerkalian = matematikaCanggih.perkalian(23, 4);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        
        int hasilModulus = matematikaCanggih.modulus(30, 7);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
}
