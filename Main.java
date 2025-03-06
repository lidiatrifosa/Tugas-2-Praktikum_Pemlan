package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lidia Trifosa Simangunsong
 */
import test.BankAccount;
public class Main {
      public static void main(String[] args) {
        // Membuat instansiasi objek dengan konstruktor
        BankAccount akun1 = new BankAccount("78806350373", "Gita", 200000);
        BankAccount akun2 = new BankAccount("033656677", "Orel", 152652);

    
        // > Panggil method utk Akun1
        akun1.displayInfo();
        akun1.deposit(1000);
        akun1.withdraw(20000);
        System.out.println(); 

          // > Panggil method utk Akun2
        akun2.displayInfo();
        akun2.deposit(1000);
        akun2.withdraw(20000);
    }
}
