import java.util.Scanner;

public class Bioskop08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        final double HARGA_TIKET = 50000;

        System.out.println("=== Program Penghitung Penjualan Tiket Bioskop ===");
        System.out.println("Ketik '0' atau nilai berhenti jika ingin mengakhiri input hari ini.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan (Ketik 0 untuk selesai): ");
            int jumlahTiket = scanner.nextInt();


            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid (negatif)! Masukkan lagi jumlah tiket yang valid.\n");
                continue;
            }

            double hargaTotal = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            double totalSetelahDiskon = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalSetelahDiskon;

            System.out.println("-> Subtotal pembayaran: Rp " + totalSetelahDiskon + " (Diskon: " + (diskon * 100) + "%)\n");
        }

        System.out.println("\n========================================");
        System.out.println("REKAPITULASI PENJUALAN TIKET DALAM SATU HARI");
        System.out.println("========================================");
        System.out.println("Total Tiket Terjual      : " + totalTiketTerjual + " tiket");
        System.out.println("Total Pendapatan Penjualan : Rp " + totalPendapatan);
        
        scanner.close();
    }
}

