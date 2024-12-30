/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author myxps
 */
// Class MatematikaBeraksi
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika
        Matematika matematika = new Matematika();

        // Eksekusi dan menampilkan hasil
        System.out.println("Pertambahan: 20 + 20 = " + matematika.pertambahan(20, 20));
        System.out.println("Pengurangan: 10 - 5 = " + matematika.pengurangan(10, 5));
        System.out.println("Perkalian: 10 * 20 = " + matematika.perkalian(10, 20));
        System.out.println("Pembagian: 21 / 2 = " + matematika.pembagian(21, 2));
    }
}
