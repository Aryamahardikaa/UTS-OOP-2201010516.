/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aryak;
import java.util.Scanner;

public class AplikasiPencatatan {
    private static final int MAX_CATATAN = 100; // Batas maksimum catatan
    private Catatan[] catatanArray; // Array untuk menyimpan catatan
    private int jumlahCatatan; // Jumlah catatan yang telah dimasukkan

    // Constructor
    public AplikasiPencatatan() {
        catatanArray = new Catatan[MAX_CATATAN];
        jumlahCatatan = 0;
    }

    // Method untuk menambah catatan
    public void tambahCatatan(String judul, String isi) {
        if (jumlahCatatan < MAX_CATATAN) {
            Catatan catatan = new Catatan(judul, isi);
            catatanArray[jumlahCatatan] = catatan;
            jumlahCatatan++;
            System.out.println("Catatan berhasil ditambahkan.");
        } else {
            System.out.println("Batas maksimum catatan telah tercapai.");
        }
    }

    // Method untuk menampilkan semua catatan
    public void tampilkanCatatan() {
        if (jumlahCatatan == 0) {
            System.out.println("Belum ada catatan yang tersimpan.");
        } else {
            System.out.println("Daftar Catatan:");
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println((i + 1) + ". " + catatanArray[i]);
            }
        }
    }

    // Method untuk mengubah catatan berdasarkan indeks
    public void ubahCatatan(int indeks, String judulBaru, String isiBaru) {
        if (indeks >= 0 && indeks < jumlahCatatan) {
            catatanArray[indeks].setJudul(judulBaru);
            catatanArray[indeks].setIsi(isiBaru);
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Indeks catatan tidak valid.");
        }
    }

    // Method untuk menghapus catatan berdasarkan indeks
    public void hapusCatatan(int indeks) {
        if (indeks >= 0 && indeks < jumlahCatatan) {
            for (int i = indeks; i < jumlahCatatan - 1; i++) {
                catatanArray[i] = catatanArray[i + 1];
            }
            jumlahCatatan--;
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Indeks catatan tidak valid.");
        }
    }
}


/**
 *
 * @author Asus
 */
