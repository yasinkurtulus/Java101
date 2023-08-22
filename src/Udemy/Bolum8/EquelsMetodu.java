package Udemy.Bolum8;

import java.util.Objects;

public class EquelsMetodu {
    public static void main(String[] args) {
       /* Kisi kisi1=new Kisi(8,"yaso");
        Kisi kisi2=new Kisi(8,"yas");
        System.out.println(kisi1.equals(kisi2));
        System.out.println(kisi1.hashCode()+" "+ kisi2.hashCode());*/
        asdas yaso=new asdas(5,"yası");

    }
}
class Kisi{
    int id;
    String isim;
    public Kisi(int id,String isim){
        this.id=id;
        this.isim=isim;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if (!(o instanceof Kisi))return false;
        Kisi kisi=(Kisi) o;
        return kisi.id==this.id&&kisi.isim==this.isim;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
public static void isimsöle(){
    System.out.println("kisi sınıfı");
}

}
class asdas extends Kisi{

    public asdas(int id, String isim) {
        super(id, isim);
    }
    public void saf(){
        isimsöle();
    }

}
