public class Queue {
    private int maxSize;
    private long[] queueArray;

    // kuyrugun onundeki elemannin indexi
    private int front;

    // kuyrugun sonundeki elemannin indexi
    private int rear;
    private int elemanSayisi;

    public Queue(int s) {
        maxSize = s;
        queueArray = new long[maxSize];
        // baslangicta kuyruk bos oldugu icin
        front = 0;
        rear = -1;
        elemanSayisi = 0;
    }

    // kuyruga eleman eklemek icin gereken fonksiyon
    public void insert(long d) {
        // rear kuyrugun sonundaysa
        // kuyrugun sonuna ulasildiysa
        if (rear == maxSize - 1) {
            // dairesel yapi icin basa donulur
            rear = -1;
        }

        // eleman diziye eklenir
        // rear indexi arttirilir
        queueArray[++rear] = d;
        elemanSayisi++;
    }

    // kuyrugun onundeki elemani cikartan fonksiyon
    public long remove() {
        // kuyrugun onundeki eleman alinir
        // cikartilan eleman temp@e atilir
        // sonraki elemana gecilir
        long temp = queueArray[front++];
        // front kuyrugun sonuna ulasirsa sifirlanir
        if (front == maxSize) {
            front = 0;
        }
        elemanSayisi--;
        return temp;
    }

    // kuyrugun onundeki eleman
    // cikarmadan dondurur
    public long peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return elemanSayisi == 0;
    }

    public boolean isFull() {
        return elemanSayisi == maxSize;
    }

    public int size() {
        return elemanSayisi;
    }
}
