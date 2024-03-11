public class Ogrenci {

    // variables
    private String ad;
    private String bolum;
    private double gano = 0.0;
    private String girisYili = "1973";
    private int bolumKodu = 104;
    private int girisSirasi = 1;

    //constructers
    //isim ve bolum alan constructer - overloaded
    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili="1985";
    }

    //input olarak ogrenci nesnesi alan constructer - overloaded
    public Ogrenci(Ogrenci ogrenci) {
        this.ad = ogrenci.ad;
        this.bolum = ogrenci.bolum;
        this.gano = ogrenci.gano;
        this.girisYili = ogrenci.girisYili;
        this.girisSirasi = ogrenci.girisSirasi;
    }

    //ad,bolum,gano,girisyili,girissirasi alan constructer - overloaded
    public Ogrenci(String ad, String bolum, double gano, String girisYili, int girisSirasi) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisYili = girisYili;
        this.girisSirasi = girisSirasi;
    }

    //default constructer
    public Ogrenci() {
    }

    //getters and setters
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    // functions
    // okulu uzatmayanlar icin harc hesaplayan fonksiyon
    public double harcHesapla(int dersSayisi) {
        return dersSayisi*20;
    }

    // okulu uzatanlar icin harc hesaplayan fonksiyon * overloaded
    public double harcHesapla(int dersSayisi, double uzatmaSuresi) {
        return dersSayisi*20 + uzatmaSuresi*dersSayisi*10;
    }

    // yeni kaydedilen ogrencinin numarasini donduran fonksiyon
    public String ogrenciNoOlustur() {
        return this.girisYili + this.bolumKodu + "00" + this.girisSirasi;
    }
}
