/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author myxps
 */
public class AC implements InterfaceAC {
    int statusAC;
    int suhuAC = SUHU_NORMAL; 

    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");
        }
    }

    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC Mati");
        } else {
            System.out.println("Matikan AC! --> AC Sudah Mati Kok");
        }
    }

    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            suhuAC -= 1; 
            System.out.println("Dinginkan AC! --> Suhu AC Sekarang: " + suhuAC + "°C");
        } else {
            System.out.println("Dinginkan AC! --> AC Dalam Keadaan Mati, Hidupkan Dulu");
        }
    }

    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            suhuAC += 1; 
            System.out.println("Panaskan AC! --> Suhu AC Sekarang: " + suhuAC + "°C");
        } else {
            System.out.println("Panaskan AC! --> AC Dalam Keadaan Mati, Hidupkan Dulu");
        }
    }
}
