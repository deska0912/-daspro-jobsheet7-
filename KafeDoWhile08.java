import java.util.Scanner;
public class KafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi,teh,roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 2000;
        int TotalHarga;

        do{

        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();
        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi dibatalkan.");
            break;
        }
        System.out.print("jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("jumlah roti: ");
        roti = sc.nextInt();
        TotalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total harga yang harus di bayar : Rp " + TotalHarga);

        sc.nextLine();
    } while (true);
    System.out.println("Semua teransaksi telah selesai.");

    sc.close();
}
}
         