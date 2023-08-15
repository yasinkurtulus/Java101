package Udemy.Odevler.Odevler_dizisoruları;

public class Soru3 {
    public static void main(String[] args) {
        /*Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki
        elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini
        ekrana yazdırın.*/
        String[]kartturu={"Kupa","Maça","Karo","Sinek"};
        String[]kartsayisi={"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int[]deste=new int[52];
        desteyiolustur(deste);
        desteyikar(deste);
        desteyiaadlandır(deste,kartturu,kartsayisi);


    }

    private static void desteyikar(int[] deste) {
        for(int i=0;i<deste.length;i++){
            int rastgelesayi=(int)(Math.random()*deste.length);
            int gecici=deste[i];
            deste[i]=deste[rastgelesayi];
            deste[rastgelesayi]=gecici;

        }
    }

    private static void desteyiaadlandır(int[] deste, String[] kartturu, String[] kartsayisi) {
        for (int i=0;i<deste.length;i++){
            String karttur=kartturu[deste[i]/13];
            String karsayi=kartsayisi[deste[i]%13];
            System.out.println(karttur+" "+karsayi);
        }
    }

    public static void desteyiolustur(int[]deste){
        for (int i=0;i<deste.length;i++){
            deste[i]=i;
        }
    }
}
