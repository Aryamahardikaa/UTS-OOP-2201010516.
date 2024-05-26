/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aryak;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    // Method untuk menampilkan menu dan menerima input dari pengguna
    public int tampilkanMenu() {
        System.out.println("\nMenu Aplikasi Pencatatan");
        System.out.println("1. Tambah Catatan");
        System.out.println("2. Tampilkan Catatan");
        System.out.println("3. Ubah Catatan");
        System.out.println("4. Hapus Catatan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        return scanner.nextInt();
    }

    // Method untuk menerima input judul dan isi catatan dari pengguna
    public String[] inputCatatan() {
        scanner.nextLine(); // Membersihkan newline di buffer
        System.out.print("Masukkan judul catatan: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan isi catatan: ");
        String isi = scanner.nextLine();
        return new String[]{judul, isi};
    }

    // Method untuk menerima nomor catatan yang ingin diubah atau dihapus dari pengguna
    public int inputNomorCatatan() {
        System.out.print("Masukkan nomor catatan: ");
        return scanner.nextInt();
    }
}
