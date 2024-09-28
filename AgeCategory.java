package Tugas_Tedas;

import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usia;
        System.out.println("Masukkan usia Anda : ");
        usia = sc.nextInt();

        // if (sc.hasNext()) {
        //     usia = sc.nextInt();
        if (usia !=0) {
            if (usia < 0) {
                System.out.println("Usia tidak valid. Masukkan angka positif.");
            } else if (usia >= 0 && usia <= 12) {
                System.out.println("Kategori: Anak");
            } else if (usia >= 13 && usia <= 19) {
                System.out.println("Kategori: Remaja");
            } else if (usia >= 20 && usia <= 64) {
                System.out.println("Kategori: Dewasa");
            } else if (usia >= 65) {
                System.out.println("Kategori: Lansia");
            }
        } else {
            System.out.println("input usia tidak ada");
        }

        sc.close();
    }
}