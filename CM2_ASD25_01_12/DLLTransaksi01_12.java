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

    public void tampilTransaksi() {
        TransaksiPengisian01_12 tmp = head;
        System.out.printf("%-15s %-15s %-15s %-10s %-10s %-10s\n", "Plat", "Jenis", "Merk", "BBM", "Liter", "Total");
        while (tmp != null) {
            tmp.tampilTransaksi();
            tmp = tmp.next;
        }
    }

    public void sortByPlatNomor() {
        if (head == null || head.next == null) return;
        TransaksiPengisian01_12 current = head;
        while (current != null) {
            TransaksiPengisian01_12 index = current.next;
            while (index != null) {
                if (current.kendaraan.platNo.compareTo(index.kendaraan.platNo) > 0) {
                    Kendaraan01_12 tempK = current.kendaraan;
                    BBM01_12 tempBBM = current.bbm;
                    double tempLiter = current.liter;
                    double tempTotal = current.totalBayar;

                    current.kendaraan = index.kendaraan;
                    current.bbm = index.bbm;
                    current.liter = index.liter;
                    current.totalBayar = index.totalBayar;

                    index.kendaraan = tempK;
                    index.bbm = tempBBM;
                    index.liter = tempLiter;
                    index.totalBayar = tempTotal;
                }
                index = index.next;
            }
            current = current.next;
        }
        System.out.println(">> Riwayat transaksi berhasil diurutkan berdasarkan plat nomor.");
    }
}