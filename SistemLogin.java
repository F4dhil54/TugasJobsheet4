package tugas_jobsheet4;

import java.util.Scanner;

public class SistemLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Simulasi username dan password yang tersimpan di sistem
        String storedUsername = "user";
        String storedPassword = "password123";
        
        System.out.println("Masukkan Username:");
        String username = scanner.nextLine();
        
        System.out.println("Masukkan Password:");
        String password = scanner.nextLine();
        
        if(username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login Berhasil!");
        } else {
            System.out.println("User dan password salah.");
        }
        
        scanner.close();
    }
}