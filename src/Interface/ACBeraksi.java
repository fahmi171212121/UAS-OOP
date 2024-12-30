package Interface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author myxps
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acRuangTamu = new AC();
        System.out.println("Status AC Saat Ini: Mati");
        
        acRuangTamu.hidupkanAC(); 
        acRuangTamu.dinginkanAC(); 
        acRuangTamu.dinginkanAC(); 
        acRuangTamu.panaskanAC(); 
        acRuangTamu.matikanAC(); 
        acRuangTamu.dinginkanAC(); 
        acRuangTamu.hidupkanAC(); 
        acRuangTamu.panaskanAC(); 
    }
}
