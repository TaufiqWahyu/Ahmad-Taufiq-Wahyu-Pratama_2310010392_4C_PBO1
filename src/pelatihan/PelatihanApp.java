package pelatihan;

import java.util.Scanner;

/**
 * Program utama untuk mengelola input peserta pelatihan.
 * Termasuk validasi agar ID hanya menerima angka (int).
 */
public class PelatihanApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SesiPelatihan sesi = new SesiPelatihan(3);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("\n== Input Peserta ke-" + (i + 1) + " ==");

                System.out.print("Masukkan Nama Karyawan: ");
                String nama = scanner.nextLine();

                int id = 0;
                boolean idValid = false;

                // Validasi input ID agar integer
                while (!idValid) {
                    System.out.print("Masukkan ID Karyawan (angka): ");
                    String inputId = scanner.nextLine();
                    try {
                        id = Integer.parseInt(inputId);
                        idValid = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Kesalahan: ID harus berupa angka!");
                    }
                }

                System.out.print("Masukkan Bidang Pelatihan (IT/HRD/Keuangan): ");
                String bidang = scanner.nextLine();

                PesertaPelatihan peserta = new PesertaPelatihan(nama, id, bidang);
                sesi.tambahPeserta(peserta);
            }

            System.out.println("\n=== Data Peserta Detail ===");
            sesi.tampilkanSemua();

            System.out.println("\n=== Data Peserta Ringkas ===");
            sesi.tampilkanRingkas();

            if (sesi.getJumlah() == 3) {
                System.out.println("\nKeterangan: Pelatihan PENUH");
            } else {
                System.out.println("\nKeterangan: Slot masih tersedia");
            }

        } catch (Exception e) {
            System.out.println("Kesalahan input: " + e.getMessage());
        }

        scanner.close();
    }
}