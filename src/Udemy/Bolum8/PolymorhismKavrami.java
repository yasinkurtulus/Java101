package Udemy.Bolum8;

public class PolymorhismKavrami {

    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan(5, 7);
        Kopek kopek = new Kopek(4, 7, "Pitbull");
        kedi kedi = new kedi(4, 2, "tekir");
        bilgiyazdir(hayvan);
        bilgiyazdir(kopek);
        bilgiyazdir(kedi);
        kedi k2=(kedi) hayvan;
    }
    public static void bilgiyazdir(Hayvan h1){
        h1.sinifbiligsiyazdir();
    }

}
class Hayvan{
    private int ayak_sayisi;
    private int yas;


    public Hayvan(int ayak_sayisi, int yas) {
        this.ayak_sayisi = ayak_sayisi;
        this.yas = yas;
    }

    public int getAyak_sayisi() {
        return ayak_sayisi;
    }

    public void setAyak_sayisi(int ayak_sayisi) {
        this.ayak_sayisi = ayak_sayisi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    public void sinifbiligsiyazdir(){
        System.out.println("Ben bir hayvan sınıfı nesnesiyim");
    }
}
class Kopek extends Hayvan{
private String cins;

    public Kopek(int ayak_sayisi, int yas,String cins) {
        super(ayak_sayisi, yas);
        this.cins=cins;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public void sinifbiligsiyazdir() {
        System.out.println("ben bir kopek sinifi nesnesiyim");
    }
}
class kedi extends Hayvan{

private String cins;
    public kedi(int ayak_sayisi, int yas,String cins) {
        super(ayak_sayisi, yas);
        this.cins=cins;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public void sinifbiligsiyazdir() {
        System.out.println("ben bir kedi sinfi nesnesiyim");
    }
}