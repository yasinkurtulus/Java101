package Udemy.Bolum10.hesapmakinesiornek;


public class Main {
    public static void main(String[] args) {
        HesapMakinesi hm=new HesapMakinesi();
        System.out.println(hm.topla(5,9));
        HesapMakinesi.Carp carp=hm.new Carp();
        System.out.println(carp.carp(7,8));
        System.out.println(hm.bol(5,5));
        //************************************************************************
        //************************************************************************
        Topla t=new Topla(){
            @Override
            public void ikisayitopla(int s1, int s2) {
                System.out.println("iki sayının toplamı");
                super.ikisayitopla(s1, s2);
            }
        };
        t.ikisayitopla(5,7);
        A a=new A() {
            @Override
            void yazdir() {
                System.out.println("abstract yazdir metotu çalıştı");
            }
        };
        a.Selamver();
        a.yazdir();
        B b=new B() {
            @Override
            public void interfacemeotot() {
                System.out.println("interface meot çalılştı");
            }

            @Override
            public void interfacemetot2() {
                System.out.println("interface metot 2 çalıştı");
            }
        };
        b.interfacemeotot();
        //**********************************************************************
        //**********************************************************************

        StaticInnerClass stclass=new StaticInnerClass();
        stclass.degisken=5;
        stclass.metot();
        StaticInnerClass.staticmetot();
        StaticInnerClass.staticdegisken=78;
        StaticInnerClass.StaticClass staticisinif=new StaticInnerClass.StaticClass();
        staticisinif.icdegisken=4;
        staticisinif.icsinifmetot();
        StaticInnerClass.StaticClass.staticicsinifmetot();
        StaticInnerClass.StaticClass.staticicsinifmetot();




    }
}
class Topla{
    public void ikisayitopla(int s1,int s2){
        System.out.println("toplam:"+(s1+s2));

    }
}
abstract class A{
    abstract void yazdir();
    void Selamver(){
        System.out.println("selam");
    }
}
interface B{
    void interfacemeotot();
    void interfacemetot2();
}

