package Udemy.Bolum8;

public class AbstractSiniflari {
    public static void main(String[] args) {
        GeometrikSekil kare1=new Kare(5);
        kare1.alanhesapla();
        kare1.cevrehesala();
        GeometrikSekil d1=new Dikdortgen(8,7);
        d1.alanhesapla();
        d1.cevrehesala();
        GeometrikSekil daire1=new Daire(4);
        daire1.alanhesapla();
        daire1.cevrehesala();
        alankarsılastır(kare1,daire1);
        alankarsılastır(kare1,d1);
        cevrekarsılastır(d1,daire1);
    }
    public static void alankarsılastır(GeometrikSekil gs1,GeometrikSekil gs2){
        if (gs1.getAlan()>gs2.getAlan())
            System.out.println("Şekil 1 alanı şekil 2dem büyük");
        else if (gs1.getAlan()<gs2.getAlan())
            System.out.println("Şekil 1 alanı şekil 2 den küçük");
        else System.out.println("Alanlar eşit");

        }
    public static void cevrekarsılastır(GeometrikSekil gs1,GeometrikSekil gs2){
        if (gs1.getCevre()>gs2.getCevre())
            System.out.println("Şekil 1 çevresi şekil 2dem büyük");
        else if (gs1.getCevre()<gs2.getCevre())
            System.out.println("Şekil 1 çevresi şekil 2 den küçük");
        else System.out.println("Çevreler eşit");

    }
}
abstract class GeometrikSekil{
    private int birincikenar;
    private int alan;
    private int cevre;

    public GeometrikSekil(int birincikenar) {
        this.birincikenar = birincikenar;
    }

    abstract public  void alanhesapla();
    abstract public void cevrehesala();
    public int getBirincikenar() {
        return birincikenar;
    }

    public void setBirincikenar(int birincikenar) {
        this.birincikenar = birincikenar;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getCevre() {
        return cevre;
    }

    public void setCevre(int cevre) {
        this.cevre = cevre;
    }
}
class Kare extends GeometrikSekil{
public Kare(int i){
   super(i);
}
    @Override
    public void alanhesapla() {
    setAlan(getBirincikenar()*getBirincikenar());
        System.out.println("Alan:"+getAlan());
    }

    @Override
    public void cevrehesala() {
        setCevre(4*getBirincikenar());
        System.out.println("Çevre:"+getCevre());
    }
}
class Dikdortgen extends GeometrikSekil{
    private int ikincikenar;

    public Dikdortgen(int ikincikenar,int birincikenar) {
        super(birincikenar);
        this.ikincikenar = ikincikenar;
    }

    @Override
    public void alanhesapla() {
        setAlan(getBirincikenar()*ikincikenar);
        System.out.println("Alan:"+getAlan());
    }

    @Override
    public void cevrehesala() {
        setCevre(2*(getBirincikenar()+ikincikenar));
        System.out.println("Çevre:"+getCevre());
    }
}
class Daire extends GeometrikSekil{
    public Daire(int birincikenar) {
        super(birincikenar);
    }

    @Override
    public void alanhesapla() {
        setAlan(getBirincikenar()*getBirincikenar()*3);
        System.out.println("Alan:"+getAlan());
    }

    @Override
    public void cevrehesala() {
        setCevre(3*getBirincikenar()*2);
        System.out.println("Çevre:"+getCevre());

    }
}
