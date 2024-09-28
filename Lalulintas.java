package tugas_jobsheet4;

import java.util.Scanner;

public class Lalulintas {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan warna lampu lalu lintas (Merah/Kuning/Hijau):");
        String lampu = scanner.nextLine().toLowerCase();

        switch (lampu) {
            case "merah":
                System.out.println("Berhenti!");
                break;
            case "kuning":
                System.out.println("Siap-siap berhenti.");
                break;
            case "hijau":
                System.out.println("Jalan.");
                break;
            default:
                System.out.println("Input tidak valid.");
                break;
        }
        scanner.close();
    }
}