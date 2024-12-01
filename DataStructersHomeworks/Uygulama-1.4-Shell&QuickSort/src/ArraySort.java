public class ArraySort {
    private static long[] dizi;
    private int elemanSayisi;
    
    //dizi olusturmaya yarar
    public ArraySort(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }
    
    //diziye eleman eklemeye yarar
    public void insert(long d) {
        dizi[elemanSayisi] = d;
        elemanSayisi++;
    }
    
    //diziyi yazdirmaya yarar
    public void display() {
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println();
    }
    
    // QUICK SORT
    public void quickSort() {
        recQuickSort(0, elemanSayisi-1);
    }

     // Quick Sort algoritmasini recursive gerceklestiren metot
    private void recQuickSort(int left, int right) {
        // Eger alt dizi sadece bir elemansa sıralamaya gerek yoktur
        if (right - left <= 0) {
            return; // Geri dön
        } else {
            // Sağdaki eleman pivot olarak seçiliyor
            long pivot = dizi[right];
            
            // Alt diziyi pivot etrafında iki gruba ayırıyoruz
            int partition = partitionIt(left, right, pivot);
            
            // Sol alt diziyi sıralamak için metodu yeniden çağırıyoruz
            recQuickSort(left, partition - 1);
            
            // Sağ alt diziyi sıralamak için metodu yeniden çağırıyoruz
            recQuickSort(partition + 1, right);
        }
    }

    // Diziyi pivot etrafında iki alt gruba boler ve pivotun dogru konumunu belirler
    private int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1; // Sol tarafı işaret eden pointer başlangıçta sol sınırın bir adım gerisinde
        int rightPtr = right;  // Sağ tarafı işaret eden pointer başlangıçta sağ sınırda

        while (true) {
            // Pivot degerinden kucuk olan elemanlari bulmak icin soldan sağa dogru ilerler
            while (dizi[++leftPtr] < pivot);

            // Pivot degerinden buyuk olan elemanlari bulmak icin sagdan sola dogru ilerler
            while (rightPtr > 0 && dizi[--rightPtr] > pivot);

            // Eğer iki pointer karsilasirsa donguyu kırar
            if (leftPtr >= rightPtr) {
                break;
            } else {
                // Sol ve sagdaki elemanlar sıralanmis olmak icin yer degistirir
                swap(leftPtr, rightPtr);
            }
        }

        // Pivotun dogru konumunu dondurur
        return leftPtr;
    }


    //dizinin iki elemanini yer degistirmeye yarar
    private void swap(int index1, int index2) {
        long temp = dizi[index1];
        dizi[index1] = dizi[index2];
        dizi[index2] = temp;
    }

    //SHELLSORT
    public  void shellSort() {
        // Başlangıçta büyük bir gap değeri ile başla
        // Gap, her seferinde küçülterek sıralama yapmayı sağlar
        for (int gap = elemanSayisi / 2; gap > 0; gap /= 2) {

            // Her gap için, sıralama yap
            for (int i = gap; i < elemanSayisi; i++) {
                long temp = dizi[i];
                int j = i;

                // Gap uzaklığındaki elemanları karşılaştırarak yer değiştir
                while (j >= gap && dizi[j - gap] > temp) { 
                    dizi[j] = dizi[j - gap];
                    j -= gap;
                }

                //Yerini bulmuş olan öğeyi yerleştir
                dizi[j] = temp;
            }
        }
    }
}