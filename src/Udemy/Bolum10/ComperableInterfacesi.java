package Udemy.Bolum10;

import java.util.Arrays;

public class ComperableInterfacesi {
    public static void main(String[] args) {
       /* String[]isimler={"yasin","bilal","ahmet","bugru"};
        System.out.println("sırlamadan önce isimler");
        for (String i:isimler)
            System.out.println(i);
        System.out.println("sıralamadan sonra isimler");
        Arrays.sort(isimler);
        for (String i:isimler)
            System.out.println(i);*/
        Ogrenci[]ogrenciler=new Ogrenci[4];
        Ogrenci ogr1=new Ogrenci(75,"yaso");
        Ogrenci ogr2=new Ogrenci(157,"taso");
        Ogrenci ogr3=new Ogrenci(5,"bilal");
        Ogrenci ogr4=new Ogrenci(84,"celalettin");
        ogrenciler[0]=ogr1;
        ogrenciler[1]=ogr2;
        ogrenciler[2]=ogr3;
        ogrenciler[3]=ogr4;
        System.out.println("karşılaştırmadan önce");
        for (Ogrenci i:ogrenciler)
            System.out.println(i);
        System.out.println("karşılaştırmadan sonra");
        Arrays.sort(ogrenciler);
        for (Ogrenci i:ogrenciler)
            System.out.println(i);

    }
}
class Ogrenci implements Comparable<Ogrenci>{
    private int no;
    private String isim;

    public Ogrenci(int no, String isim) {
        this.no = no;
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "ad:"+isim+" no:"+no;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if (this.isim.compareTo(o.isim)<0)
            return -1;
        else if (this.isim.compareTo(o.isim)>0)
        return 1;
        else return 0;

    }
}


