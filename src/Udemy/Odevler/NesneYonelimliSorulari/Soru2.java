package Udemy.Odevler.NesneYonelimliSorulari;

public class Soru2 {/*Ogrenci isimli sınıf oluşturun. Bu sınıfta ogrencinin idsi ve not değeri
        tutulmalı. 100 elemanlı bir dizide id ve not değerlerini rastgele olusturarak
        bu ogrencileri saklayın ve bu ogrencileri aldıkları notlara göre azalan sırada
        yazdıran metotu yazın.
        */

    public static void main(String[] args) {
        Ogrenci[] tumOgrenciler=new Ogrenci[100];
        for (int i=0;i<tumOgrenciler.length;i++){
            int id=(int)(Math.random()*5000);
            int not=(int)(Math.random()*101);

            Ogrenci yeni=new Ogrenci(id,not);
            tumOgrenciler[i]=yeni;
        }
        diziyisırala(tumOgrenciler);
        for (int i=0;i<tumOgrenciler.length;i++){
            System.out.println(i+" "+tumOgrenciler[i].getId()+" id li öğrencinmin notu: "+tumOgrenciler[i].getNot());
        }
    }
    public static void diziyisırala(Ogrenci[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int oankienbuyuksayi = dizi[i].getNot();
            int oankienbuyuksayiindex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (oankienbuyuksayi < dizi[j].getNot()) {
                    oankienbuyuksayi = dizi[j].getNot();
                    oankienbuyuksayiindex = j;
                }
            }
            if (oankienbuyuksayiindex != i) {
                dizi[oankienbuyuksayiindex] = dizi[i];
                dizi[i].setNot(oankienbuyuksayi);
            }
        }

    }
}
class Ogrenci{
    private int id;
     private int not;
    public Ogrenci(int id,int not){
        this.id=id;
        this.not=not;
    }

    public int getId() {
        return id;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
