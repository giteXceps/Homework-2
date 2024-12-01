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

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            long pivot = dizi[right];
            int partition = patitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }

    }

    // diziyi pivot etrafında ikiye ayirir pivotun dogru konumunu belirler
    private int patitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;

        while(true){
            while (dizi[++leftPtr] < pivot);

            while(rightPtr >0 && dizi[--rightPtr] > pivot);

            if(leftPtr >= rightPtr){
                break;
            }
            else{
                swap(leftPtr, rightPtr);
            }
        }
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