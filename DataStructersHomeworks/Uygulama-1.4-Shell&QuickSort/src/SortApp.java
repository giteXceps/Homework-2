import java.util.Random;

public class SortApp {
    public static void main(String[] args) {

        ArraySort dizi1 = new ArraySort(9);
        Random random = new Random();

        // rastgele sayilar ile olusan dizi
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));
        dizi1.insert(random.nextLong(100));

        // dizinin normal hali yazdirilir
        System.out.println("Dizinin normal hali: ");;
        dizi1.display();

        // Shell Sort ile sıralama
        System.out.println("ShellSort ile siralanmis dizi:");
        dizi1.shellSort();
        dizi1.display(); 

        // Quick sort ile sırlanmis hali
        System.out.println("QuickSort ile siralanmis dizi:");
        dizi1.quickSort();
        dizi1.display(); 
    }
}
