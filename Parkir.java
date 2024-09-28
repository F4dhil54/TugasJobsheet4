package tugasjobsheet4 ;

import java.util.Scanner;

public class Parkir {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biayaParkir;
        int durasi;
        int totalBiaya;
        String jenisKendaraan;
        
        System.out.println("Pilih jenis kendaraan (Mobil/Motor):");
        jenisKendaraan = sc.nextLine().toLowerCase();
        System.out.println("Masukkan durasi parkir (dalam jam):");
        durasi = sc.nextInt();
        
        switch (jenisKendaraan) {
            case "mobil":
                biayaParkir = 5000;
                break;
            case "motor":
                biayaParkir = 3000;
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid.");
                sc.close();
                return;
        }

        totalBiaya = biayaParkir * durasi;
        System.out.println("Jenis kendaraan : " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp" + totalBiaya);
        
        sc.close();
    }
}

