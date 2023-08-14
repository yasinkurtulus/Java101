package Udemy.Odevler.bolumsonusorulari1;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Soru2: Klavyeden girilen bir üçgenin çeşdini veren bir uygulama yazınız.

        System.out.println("Üçgenin kenarlarını giriniz: ");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();
        if (kenar1==kenar2&&kenar1==kenar3&&kenar2==kenar3)
            System.out.println("Eşkenar bir üçgen girdiniz");
        else if ((kenar1==kenar2&&kenar1!=kenar3)||(kenar1==kenar3&&kenar1!=kenar2)||(kenar3==kenar2&&kenar1!=kenar3))
            System.out.println("ikizkenar bir üçgen girdiniz");
        else
            System.out.println("çeşitkenar bir üçgen girdiniz");
    }
}
