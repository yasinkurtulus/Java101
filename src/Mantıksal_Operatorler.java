public class Mantıksal_Operatorler {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        System.out.println("sayi1 eşittir sayi2 "+(sayi1==sayi2));
        System.out.println("sayi1 büyüktür sayi2 "+(sayi1>sayi2));
        System.out.println("sayi1 küçüktür sayi2 "+(sayi1<sayi2));
        System.out.println("sayi1 eşit değildir sayi2 "+(sayi1!=sayi2));

        boolean deger1=true;
        boolean deger2=false;
        System.out.println("değer1 ve (&&) değer 2  "+(deger1&&deger2));
        System.out.println("değer1 veya (||) değer 2  "+(deger1||deger2));

        if (sayi1==20||sayi2<20)
        {
            System.out.println("1. if blogu sağlandı");
        }
        else {
            System.out.println("1. if blogu sağlanmadı");
        }
        if ((sayi1<sayi2)&&(sayi1==10))
        {
            System.out.println("sayi 1 küçüktür sayi 2 den ve sayi1 10'dur");
        }


    }
}
