package CM2_ASD25_01_12;

public class BBM01_12 {
    String namaBBM;
    double hargaPerLiter;
    BBM01_12 prev, next;
    
    
    public BBM01_12(String namaBBM, double hargaPerLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
         this.next = this.prev = null;
    }

}
