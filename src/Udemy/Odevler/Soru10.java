package Udemy.Odevler;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        sonra bulduğunu belirtelim.*/
        int randomsayi=(int)(Math.random()*99)+1;
        int tahminsayısı=0;
        while (true){
            System.out.println("Sayıyı Tahmin ediniz: ");
            int tahmin=scanner.nextInt();
            tahminsayısı++;
            if (tahmin==randomsayi){
                System.out.println("Tebrikler Kazandınız|Sayı: "+randomsayi+" Tahmin sayısı: "+tahminsayısı);
                break;
            } else if (randomsayi<tahmin) {
                System.out.println("Tahmininizi Azaltınız");
            } else if (randomsayi>tahmin) {
                System.out.println("Tahmininizi Arttırınız");
            }

        }


    }
}
