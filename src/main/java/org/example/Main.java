import java.util.Scanner;

public class Main {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";
    private static final int NIM_LENGTH = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n== Sistem Perpustakaan");
            System.out.println("1. Masuk sebagai Pelajar");
            System.out.println("2. Masuk sebagai Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (option) {
                case 1:
                    pelajarLogin(scanner);
                    break;
                case 2:
                    adminLogin(scanner);
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih opsi 1-3.");
            }
        }
        scanner.close();
    }

    private static void pelajarLogin(Scanner scanner) {
        System.out.print("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();

        if (nim.length() == NIM_LENGTH) {
            System.out.println("Login Berhasil sebagai Pelajar");
        } else {
            System.out.println("Pengguna tidak ditemukan");
        }
    }

    private static void adminLogin(Scanner scanner) {
        System.out.print("Masukkan nama pengguna Anda (admin): ");
        String username = scanner.nextLine();
        System.out.print("Masukkan kata sandi Anda (admin): ");
        String password = scanner.nextLine();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Berhasil Login sebagai Admin");
        } else {
            System.out.println("Pengguna Admin Tidak Ditemukan!!");
        }
    }
}