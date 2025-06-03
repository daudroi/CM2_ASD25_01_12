package CM2_ASD25_01_12;

public class TransaksiPengisian01_12 {
    TransaksiPengisian01_12 prev, next;
    Kendaraan01_12 kendaraan;
    BBM01_12 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian01_12(TransaksiPengisian01_12 prev, Kendaraan01_12 kendaraan, BBM01_12 bbm, double liter, TransaksiPengisian01_12 next) {
        this.prev = prev;
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
        this.next = next;
    }
}
