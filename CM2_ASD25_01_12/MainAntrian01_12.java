package CM2_ASD25_01_12;

import java.util.Scanner;
public class MainAntrian01_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL01_12 dll = new DLL01_12();
        int pilih;

        do { 
            System.out.println("===================");
            System.out.println("     Pilih Menu    ");
            System.out.println("===================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Cek Sisa Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Sort Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1: 
                    System.out.print("Masukan plat nomor : ");
                    String platNo = sc.nextLine();
                    System.out.print("Masukan tipe kendaraan : ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukan merk : ");
                    String merk = sc.nextLine();
                    dll.tambahData(platNo, tipe, merk);
                    break;
                case 2:
                    dll.tampilkanAntrian();
                    break;
                case 3:
                    System.out.println("Jumlah Antrian : " + dll.size());
                    break;
                default : 
                break;
            }
        } while (true);
    }
}