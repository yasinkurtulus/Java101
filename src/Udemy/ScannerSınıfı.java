package Udemy;

import java.util.Scanner;

public class ScannerSınıfı {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
     /  System.out.println("İsminizi Giriniz:");
        String isimSoysisim= scanner.nextLine();
        System.out.println("Yaşınızı Girin: ");
        int yas= scanner.nextInt();
        System.out.println("isminiz"+isimSoysisim+"Yaşınız: "+yas);
        char basHarf=scanner.next().charAt(0);
        System.out.println(basHarf);
        String isims= scanner.next();
        System.out.println(isims);
        String soyisim= scanner.nextLine();
        System.out.println(soyisim);



    }

}
