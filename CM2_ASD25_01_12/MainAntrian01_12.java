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
            System.out.println("");
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
                
                default : {}
            }
        } while (true);
    }
}