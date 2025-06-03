package CM2_ASD25_01_12;

public class DLL01_12 {
    Kendaraan01_12 head, tail;
    int size = 0;
    Kendaraan01_12 Kendaraan = new Kendaraan01_12(tail, null, null, null, head);
    
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
            System.out.println("berhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
}
