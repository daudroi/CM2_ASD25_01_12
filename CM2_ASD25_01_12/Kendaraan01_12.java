package CM2_ASD25_01_12;

public class Kendaraan01_12 {
    String platNo, tipe, merk;
    Kendaraan01_12 prev, next;

    public Kendaraan01_12(Kendaraan01_12 prev,String plat, String tipe, String merk, Kendaraan01_12 next) {
        this.prev = prev;
        this.platNo = plat;
        this.tipe = tipe;
        this.merk = merk;
        this.next = next;
    }
    public void tampilInformasi(){
        System.out.printf("%-20s %-20s %-20s\n", platNo, tipe, merk);
    }
    public void tampilplat(){
         System.out.println(platNo);
    }
}
