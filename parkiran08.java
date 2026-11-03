 import java.util.Scanner;
public class parkiran08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = scanner.nextInt();

            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = scanner.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000; 
                } else {
                    total += durasi * 2000; 
                }
            } else if (jenis != 0) {
                System.out.println("Jenis kendaraan tidak valid! Silakan masukkan pilihan yang benar.");
            }

            System.out.println();
        } while (jenis != 0);

        System.out.println("========================================");
        System.out.println("Total keseluruhan pembayaran parkir : Rp " + total);
        System.out.println("========================================");

        scanner.close();
    }
}

