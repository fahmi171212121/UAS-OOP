/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author myxps
 */
public class Sepeda {
    private int gir;

    public void setGir(int perubahanGir) {
        if (gir + perubahanGir >= 0) {
            gir += perubahanGir;
        } else {
            System.out.println("Nilai gir tidak bisa kurang dari 0!");
        }
    }

    public int getGir() {
        return gir;
    }
}
