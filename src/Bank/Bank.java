/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author myxps
 */
public class Bank {
    private int saldo;

    public Bank(int saldoAwal) {
        saldo = saldoAwal;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public void ambilUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan.");
        }
    }

    public int getSaldo() {
        return saldo;
    }
}
