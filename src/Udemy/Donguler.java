package Udemy;

public class Donguler {
    public static void main(String[] args) {
            int sayi=11;
       /* for (  ;sayi<15; sayi++){
            System.out.println("merhaba");
            System.out.println(sayi);
        }
        for ( sayi=10 ;sayi<15; sayi++){
            System.out.println("merhaba");
            System.out.println(sayi);
        }*/
       /* for ( int i=10 ;sayi<15; sayi++){
            System.out.println("merhaba");
            System.out.println(sayi);
        }
        System.out.println(sayi);
        while(sayi<20){
            System.out.println("While Döngüsü"+sayi);
            sayi++;
        }
        int i=10;
        do {
            System.out.println("do whilenın sayi"+i);
            i++;
        }while(i<20);*/


        //break,counitine ,return<
        birincifor:
        for (int i=0;i<5;i++){
            ikincifor:
            for (int a=0;a<4;a++){
                if (i==1&&a==1)
                    continue ;
                System.out.println("I:"+ i +" a:"+a);
              //  if (i==1&&a==1)
                   // break birincifor;
            }
        }






    }
}
