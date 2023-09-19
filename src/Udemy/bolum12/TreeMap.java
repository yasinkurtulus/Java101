package Udemy.bolum12;

import java.util.Comparator;

public class TreeMap {
    public static void main(String[] args) {
        //Tree map verişileri istediğimiz şekilde sıralamamızı sağlayan bir HashMaptir.
        //Key değerlerine göre sıralar
        java.util.TreeMap<String,Integer>sehirler=new java.util.TreeMap<>();
        sehirler.put("ankara",01);
        sehirler.put("adana",5);
        sehirler.put("sakarya",54);
        sehirler.put("istanbul",34);
        sehirler.put("izmir",35);
        System.out.println(sehirler.firstEntry());
        System.out.println(sehirler.descendingKeySet());
        System.out.println(sehirler);
        java.util.TreeMap<Kare,String> kareler=new java.util.TreeMap<>(new Comparator<Kare>() {
            @Override
            public int compare(Kare o1, Kare o2) {
                if (o1.kenar<o2.kenar)
                    return -1;
                else if (o1.kenar==o2.kenar)
                    return 0;
                else
                    return 1;
            }
        });
        Kare k1=new Kare(4,"sarı");
        Kare k2=new Kare(8,"mavi");
        Kare k3=new Kare(7,"kırmızı");
        Kare k4=new Kare(1,"turuncu");
        kareler.put(k1,"sarıkare");
        kareler.put(k2,"mavikare");
        kareler.put(k3,"kırmızıkare");
        kareler.put(k4,"turuncukare");
        System.out.println(kareler);

    }
}
class Kare implements  Comparable<Kare>{
    int kenar;
    String renk;

    public Kare(int kenar, String renk) {
        this.kenar = kenar;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                ", renk='" + renk + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kare o) {
        if (this.kenar<o.kenar)
            return -1;
        else if (this.kenar==o.kenar)
            return 0;
        else return -1;
    }
}
