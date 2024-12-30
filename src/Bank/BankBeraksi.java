/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author myxps
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bank = new Bank(100000);

        System.out.println("Selamat Datang di Bank KU");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        bank.simpanUang(500000);
        System.out.println("Simpan uang: Rp. 500000");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());

        bank.ambilUang(150000);
        System.out.println("Ambil uang: Rp. 150000");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}
