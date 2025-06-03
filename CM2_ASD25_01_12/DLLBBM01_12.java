package CM2_ASD25_01_12;

public class DLLBBM01_12 {
    BBM01_12 head, tail;
    int size = 0;
    BBM01_12 bbm = new BBM01_12(null, 0);
    
     public void tambahData(String namaBBM, Double hargaPerLiter) {
    BBM01_12 newNode = new BBM01_12(namaBBM, hargaPerLiter);
    if (head == null) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    size++;
}
     public void tampilBBM() {
    System.out.println("Daftar Jenis BBM :");
    System.out.printf("%-20s %-20s\n", "JenisBBM", "Harga");

    BBM01_12 current = head;
    while (current != null) {
        System.out.printf("%-20s %-20.2f\n", current.namaBBM, current.hargaPerLiter);
        current = current.next;
    }
}
public BBM01_12 cariBBM(String nama) {
    BBM01_12 tmp = head;
    while (tmp != null) {
        if (tmp.namaBBM.equalsIgnoreCase(nama)) {
            return tmp;
        }
        tmp = tmp.next;
    }
    return null;
}
}
