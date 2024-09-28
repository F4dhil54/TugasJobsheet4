package tugas_jobsheet4;

import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan umur: ");
        
        if (sc.hasNextInt()) {  // di buat ngecek apakah benar inputan angka atau tidak jika tidak akan mengeluarkan else
            int umur = sc.nextInt();  // di gunakan untuk input umur

            if (umur < 0) {
                System.out.println("umur tidak valid.");
            } else if (umur < 12) {
                System.out.println("Kategori: Anak-anak");
            } else if (umur < 19) {
                System.out.println("Kategori: Remaja");
            } else if (umur < 65) {
                System.out.println("Kategori: Dewasa");
            } else if (umur > 65){
                System.out.println("Kategori: Lansia");
            }
        } else {
            System.out.println("umur tiak valid.");
        }

        sc.close();
    }
}