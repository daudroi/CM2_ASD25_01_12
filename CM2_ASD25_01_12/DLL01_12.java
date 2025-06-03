package CM2_ASD25_01_12;

public class DLL01_12 {
    Kendaraan01_12 head, tail;
    int size = 0;
    Kendaraan01_12 Kendaraan = new Kendaraan01_12(tail, null, null, null, head);
    DLLBBM01_12 bbm = new DLLBBM01_12();
    
    public void tambahData(String platNo, String tipe, String merk) {
        Kendaraan01_12 newNode = new Kendaraan01_12(tail, platNo, tipe, merk, head);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void tampilkanAntrian() {
      if (!isEmpty()) {
            Kendaraan01_12 tmp = head;
             System.out.println("-- Antrian Kendaraan --");
             System.out.printf("%-20s %-20s %-20s\n", "Plat Nomor", "Jenis", "Merk");
            while (tmp != null) {
                tmp.tampilInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong");
        }
    }


    public int size() {
        int count = 0;
        Kendaraan01_12 tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return  count;
    }
      public void layaniKendaraan(){
        if(!isEmpty()){
           System.out.print("Kendaraan ");
           head.tampilplat();
           System.out.println();
           
        }else{
            System.out.println("Antrian Kosong");
        }
    }
        public Kendaraan01_12 removeLast() {
    if (tail == null) return null;

    Kendaraan01_12 tmp = tail;
    if (tail.prev != null) {
        tail = tail.prev;
        tail.next = null;
    } else {
        head = tail = null;
    }
    return tmp;
    }
}
