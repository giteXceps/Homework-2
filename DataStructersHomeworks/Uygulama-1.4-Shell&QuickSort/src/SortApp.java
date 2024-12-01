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

        //dizinin normal hali yazdirilir
        System.out.println("Orijinal Dizi:");
        arraySort.display();

        // Shell Sort ile sıralama
        System.out.println("ShellSort ile siralanmis dizi:");
        arraySort.shellSort();
        arraySort.display();

        // Quick sort ile sırlanmis hali
        System.out.println("QuickSort ile siralanmis dizi:");
        arraySort.quickSort();
        arraySort.display();
    }
}
