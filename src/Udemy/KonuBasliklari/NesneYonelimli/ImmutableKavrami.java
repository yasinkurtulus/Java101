package Udemy.KonuBasliklari.NesneYonelimli;

public class ImmutableKavrami {
    public static void main(String[] args) {
        String[] firmalar={"asus","monster","acer"};
        String[] dizi;
        Bilgisayar b1=new Bilgisayar(8,64,firmalar);
        bilgisayarbilgileriyazdir(b1);
        dizi=b1.getUreticifirma();
        dizi[0]="samsung";
        bilgisayarbilgileriyazdir(b1);

    }
    public static void bilgisayarbilgileriyazdir(Bilgisayar bilgisayar){
        System.out.println("Bilgisayar çekirdek sayisi:"+bilgisayar.getCekirdek()+" Bilgisyar rami:"+bilgisayar.getRam()+" üretici firmalar:"+bilgisayar.getUreticifirma()[0]);

    }
}
class Bilgisayar{
    private int cekirdek;
    private int ram;
    private String[] ureticifirma;
    public Bilgisayar(int csayi,int ram,String[]firmalar){
        this.cekirdek=csayi;
        this.ram=ram;
        this.ureticifirma=firmalar;
    }

    public int getCekirdek() {
        return cekirdek;
    }

    public int getRam() {
        return ram;
    }

    public String[] getUreticifirma() {
        String[]kopyadizi=new String[ureticifirma.length];
        for (int i=0;i<ureticifirma.length;i++){
            kopyadizi[i]=ureticifirma[i];
        }
        return kopyadizi;

    }
}
