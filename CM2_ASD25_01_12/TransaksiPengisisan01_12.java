package CM2_ASD25_01_12;

public class TransaksiPengisisan01_12 {
    Kendaraan01_12 kendaraan;
    BBM01_12 bbm;
    double liter, totalBayar;
        
    public void TransaksiPengisian01_12(Kendaraan01_12 kendaraan, BBM01_12 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }
}
