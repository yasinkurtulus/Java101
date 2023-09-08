package Udemy.Bolum11.VeterinerSim;

public class main {
    public static void main(String[] args) {
      Kedi k1=new Kedi("2010","Pamuk",2,"Tekir");
      Kedi k2=new Kedi("2020","Topiş",1,"Van");
      Kopek ko1=new Kopek("2019","Miço","sokak",4);
      Kopek ko2=new Kopek("2013","Karabaş","Kangal",2);
      k1.bilgilerigoster();
        k1.asiyap();
        k1.bilgilerigoster();
        Müsteri ahmet=new Müsteri("Ahmet",543,"İstanbul");
        ahmet.hayvanekle(k1);
        ahmet.hayvanekle(ko1);
        ahmet.sahipolunanhayvanlistele();

    }
}
