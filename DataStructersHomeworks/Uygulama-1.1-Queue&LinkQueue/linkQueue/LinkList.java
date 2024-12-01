public class LinkList {
    private Link head;
    private Link tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    // bosluk konmtrolu
    public boolean isEmpty() {
        return head == null;
    }

    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            head = newLink;
        } else {
            tail.next = newLink;
        }
        tail = newLink;
    }

    // dugumden eleman silme
    public long deleteFirst() {
        long temp = head.data;
        // Liste tek dugum mu barindiriyor
        if (head.next == null) {
            tail = null;
        }
        // Listede birden fazla dugum varsa
        head = head.next;
        return temp;
    }

    // listeyi yazdirma
    public void displayList() {
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
