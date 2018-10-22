/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan45_cetaknama;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : PBO3
 * Deskripsi Program  : Program ini berisi program untuk menampilkan 
 * hasil cetak nama yang di input user
 */
public class PBO3_10117109_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        Printer print = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        print.setNama(keyboard.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        print.setJmlCetak(keyboard.nextInt());
        
        print.cetak(print.getNama());
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
