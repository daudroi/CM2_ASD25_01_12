package CM2_ASD25_01_12;

public class DLLTransaksi01_12 {
    TransaksiPengisian01_12 head, tail;

    public void tambahTransaksi(Kendaraan01_12 kendaraan, BBM01_12 bbm, double liter) {
        TransaksiPengisian01_12 baru = new TransaksiPengisian01_12(null, kendaraan, bbm, liter, null);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

//     public void tampilTransaksi() {
//         TransaksiPengisian01_12 tmp = head;
//         System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s\n", "Plat", "Jenis", "Merk", "BBM", "Liter", "Total");
//         while (tmp != null) {
//             tmp.tampilTransaksi();
//             tmp = tmp.next;
//         }
//     }
}
