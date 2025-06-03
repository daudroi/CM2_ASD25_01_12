package CM2_ASD25_01_12;

import java.util.Scanner;

public class MainAntrian01_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL01_12 dll = new DLL01_12();
        DLLBBM01_12 bbm = new DLLBBM01_12();
        DLLTransaksi01_12 tr = new DLLTransaksi01_12();
        int pilih;
        bbm.tambahData("Pertalite", 10000.00);
        bbm.tambahData("Pertamax", 12400.00);
        bbm.tambahData("Biosolar", 6800.00);
        bbm.tambahData("DexLite", 13400.00);

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
                case 4:
                if (dll.isEmpty()) {
                      System.out.println(">> Tidak ada kendaraan dalam antrian.");
                      break;
                  }
                    dll.layaniKendaraan();
                    bbm.tampilBBM();
                    Kendaraan01_12 k = dll.removeLast();

                    System.out.print("Input Jenis BBM : ");
                    String namaBBM = sc.nextLine();

                    BBM01_12 bbm1 = bbm.cariBBM(namaBBM);

                    if (bbm1 == null) {
                        System.out.println(">> Jenis BBM tidak ditemukan.");
                        break;
                    }

                    System.out.print("Jumlah Liter : ");
                    double liter = sc.nextDouble();
                    sc.nextLine();

                    tr.tambahTransaksi(k, bbm1, liter); 
                    System.out.println(">> Transaksi berhasil ditambahkan.");
                    break;
                default:
                    break;
            }
        } while (true);
    }
}