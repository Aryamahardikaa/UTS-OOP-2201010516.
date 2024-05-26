/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aryak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AplikasiPencatatan aplikasi = new AplikasiPencatatan();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int pilihan = menu.tampilkanMenu();
            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    return;
                case 1:
                    System.out.println("Masukkan catatan baru:");
                    String[] catatanBaru = menu.inputCatatan();
                    aplikasi.tambahCatatan(catatanBaru[0], catatanBaru[1]);
                    break;
                case 2:
                    aplikasi.tampilkanCatatan();
                    break;
                case 3:
                    int indeksUbah = menu.inputNomorCatatan();
                    System.out.println("Masukkan judul dan isi catatan baru:");
                    String[] catatanUbah = menu.inputCatatan();
                    aplikasi.ubahCatatan(indeksUbah - 1, catatanUbah[0], catatanUbah[1]);
                    break;
                case 4:
                    int indeksHapus = menu.inputNomorCatatan();
                    aplikasi.hapusCatatan(indeksHapus - 1);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
