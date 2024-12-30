/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author myxps
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih math = new MatematikaCanggih();

        
        System.out.println("Hasil pecahan: " + math.pecahan(12.5, 28.7, 14.2));

        
        System.out.println("Pertambahan (12.5, 28.7, 14.2): " + math.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (12, 28, 14): " + math.pertambahan(12, 28, 14));
        System.out.println("Pertambahan (23, 34): " + math.pertambahan(23, 34));
        System.out.println("Pertambahan (3.4, 4.9): " + math.pertambahan(3.4, 4.9));
    }
}
