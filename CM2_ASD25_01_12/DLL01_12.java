package CM2_ASD25_01_12;

public class DLL01_12 {
    Kendaraan01_12 head, tail;
    int size = 0;
    
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
}
