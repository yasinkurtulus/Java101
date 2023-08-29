package Udemy.Bolum8;

public class KalitimKavrami {
    public static void main(String[] args) {
        Kisiler kisi=new Kisiler("yasin",44648,6);
        System.out.println(kisi);
       Ogrenci ogr=new Ogrenci("sfasdf",7896768,10,31,12);
        System.out.println(ogr);
        MezunOgrenci mezun=new MezunOgrenci("yaso",766876,37,245,12,2027);
        mezun.setIsim("Yasotaso");
        mezun.setYas(36);
        System.out.println(mezun);
    }
}
class Kisiler{
    private String isim;
    private int tc;
     int yas=20;
     static int a=1;


    public Kisiler(String isim, int tc, int yas) {
        this.isim = isim;
        this.tc = tc;;
        setYas(yas);
    }

    public  String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>18)
        this.yas = yas;
        else this.yas=18;
    }

    @Override
    public String toString() {
        return "isim "+isim+" tc "+tc+" yaş "+yas;
    }

}
class Ogrenci extends Kisiler{
    public int ogrno;
    private int sinif;
    int yas=10;


    public Ogrenci(String isim, int tc, int yas, int ogrno, int sinif) {
        super(isim, tc, yas);
        this.ogrno = ogrno;
        this.sinif = sinif;
        a=5;
    }

    public int getOgrno() {
        return ogrno;
    }

    public void setOgrno(int ogrno) {
        this.ogrno = ogrno;
    }


    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return  "isim "+getIsim()+" tc "+getTc()+" yaş "+getYas()+" no "+ogrno+" sınıf "+sinif;
    }

}
class MezunOgrenci extends Ogrenci{
    private int mezuniyetyili;

    public MezunOgrenci(String isim, int tc, int yas, int ogrno, int sinif,int mezuniyetyili) {
        super(isim, tc, yas, ogrno, sinif);
        this.mezuniyetyili=mezuniyetyili;

    }

    public int getMezuniyetyili() {
        return mezuniyetyili;
    }

    public void setMezuniyetyili(int mezuniyetyili) {
        this.mezuniyetyili = mezuniyetyili;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}





