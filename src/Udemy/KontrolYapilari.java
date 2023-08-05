package Udemy;

public class KontrolYapilari {
    public static void main(String[] args) {
        int sayi1 = 12, sayi2 = 11;
        int sayi3;
        if (sayi1 < sayi2) {
            sayi3 = sayi1 + sayi2;
        } else {
            sayi3 = sayi1 - sayi2;
        }
        System.out.println(("sayi 3 'ün değeri:  " + sayi3));
        sayi3 = (sayi1 < sayi2) ? (sayi1 + sayi2) : (sayi1 > sayi2) ? (sayi1 - sayi2) : 16;
        System.out.println(("sayi 3 'ün değeri:  " + sayi3));
        //Swtich Case
        int durum = 1;

        if (durum == 1) {
            System.out.println("1.durumdasınız");
            durum=2;
        } else if (durum == 2) {
            System.out.println("2.durumdasınız");
        } else if (durum == 3) {
            System.out.println("3.durumdasınız");
        }


       switch (durum) {
            case 1:  System.out.println("1.durumdasınız");
                System.out.println("dsadsa");;   break;
            case 2:System.out.println("switch 2.durumdasınız");break;
            case 3 :System.out.println("3.durumdasınız");break;
        }


    }

}
