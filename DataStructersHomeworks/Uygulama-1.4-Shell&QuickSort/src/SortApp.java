import java.util.Random;

public class SortApp {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort(9);
        Random random = new Random();
        // rastgele sayilar ile olusan dizi
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        arraySort.insert(random.nextLong(100));
        
        System.out.println("Orijinal Dizi:");
        arraySort.display();
        
        // Shell Sort ile Quick Sort'u kullanarak sıralama
        arraySort.shellSort();
        arraySort.display();
        
        arraySort.quickSort();
        
        System.out.println("Siralanmis Dizi:");
        arraySort.display();
    }
}
