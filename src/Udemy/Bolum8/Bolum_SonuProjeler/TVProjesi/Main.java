package Udemy.Bolum8.Bolum_SonuProjeler.TVProjesi;

import java.util.Scanner;

public class Main {
   static Scanner scanner=new Scanner(System.in);
   static tv tv;
    public static void main(String[] args) {
        Boolean dongu=true;
        while (dongu){
            menuyugöster();
            int secim=scanner.nextInt();
            switch (secim){
                case 1:dongu=false;break;
                case 2:tvyikur();break;
                case 3:tvac();break;
                case 4: if (tv!=null)
                    tv.sesarttır();
                else System.out.println("tv kurulmadı");
                    ;break;
                case 5:if (tv!=null)
                    tv.sesazalt();
                else System.out.println("Tv kurulmadı");break;
                case 6 :kanaldegistir();break;
                case 7:
                    if (tv!=null)
                        tv.kanalbilgisigoster();
                        else System.out.println("tv kurulu değil");break;
                case 8:tv.tvkapat();break;
            }
        }

    }

    private static void kanaldegistir() {
       if (tv!=null&&tv.isAcık()){
           System.out.println( "Kanal giriniz:");
           int no=scanner.nextInt();
           tv.kanaldegistir(no);
       }
       else System.out.println("tv kapalı ve ya kurulu değil");
    }

    private static void tvyikur() {
        if (tv==null){
        scanner.nextLine();
        System.out.println("Marka giirniz:");
        String marka=scanner.nextLine();
        System.out.println("Boyut giriniz:");
        int boyut=scanner.nextInt();
        tv=new tv(marka,boyut);
        tv.kanallariolustur();
        System.out.println(tv);
        }
        else System.out.println("Tv zaten kuruldu");

    }
    public static void tvac(){
        if (tv!=null){
            tv.tvac();
        }
        else System.out.println("Tv yi kurunuz");
    }
    public static void tvkapat(){
        if (tv!=null){
            tv.tvkapat();
        }
        else System.out.println("Tv yi kurunuz");
    }

    public static void menuyugöster(){
        System.out.println("1--Çıkış\n"+
                "2--TV yi kur\n"+
                "3--TV yi aç\n"+
                "4--Ses arttır\n"+
                "5--Ses azalt\n"+
                "6--Kanal değiştir\n"+
                "7--Kanal bilgisi göster\n"+
                "8--TV yi kapat");

    }
}
