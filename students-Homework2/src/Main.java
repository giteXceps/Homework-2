public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ogrencilerin Bilgileri");

        // Ogrenci 1 efault constructer kullanilarak yapilan kayit
        Ogrenci ogrenci1 = new Ogrenci();
        System.out.printf("OGR-1 %s %s %s %.1f\n", ogrenci1.getAd(), ogrenci1.getBolum(), ogrenci1.ogrenciNoOlustur(), ogrenci1.getGano());

        //input olarak yalnizca ad ve bolum alan constructer
        Ogrenci ogrenci2 = new Ogrenci("Gokhan", "Bilgisayar Muh");
        System.out.printf("OGR-2 %s %s %s %.1f\n", ogrenci2.getAd(), ogrenci2.getBolum(), ogrenci2.ogrenciNoOlustur(), ogrenci2.getGano());

        //input olarak ogrenci2 nesnesi gonderilerek olusturulan nesne
        Ogrenci ogrenci3 = new Ogrenci(ogrenci2);
        ogrenci3.setAd("Ayse");
        ogrenci3.setBolum("Makine Muh");
        System.out.printf("OGR-3 %s %s %s %.1f\n", ogrenci3.getAd(), ogrenci3.getBolum(), ogrenci3.ogrenciNoOlustur(), ogrenci3.getGano());

        //5 farkli degisken alan constructer kullanilarak olusturulan nesne
        Ogrenci ogrenci4 = new Ogrenci("Elif", "Elektrik-Elektronik Muh", 1.98, "2020",1);
        System.out.printf("OGR-4 %s %s %s %.2f\n", ogrenci4.getAd(), ogrenci4.getBolum(), ogrenci4.ogrenciNoOlustur(), ogrenci4.getGano());

        //3. ve 4. ogrenciler icin harc hesaplama
        System.out.println("3. ogrencinin odeyecegi harc: " + ogrenci3.harcHesapla(24));
        System.out.println("4. ogrencinin odeyecegi harc: " + ogrenci4.harcHesapla(24,2));
    }
}
