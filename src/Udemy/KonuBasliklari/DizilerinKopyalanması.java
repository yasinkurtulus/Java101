package Udemy.KonuBasliklari;

public class DizilerinKopyalanması {
    public static void main(String[] args) {
       int[] anadizi={0,54,78,13};
       int[] kopyadizi=new int[anadizi.length];
       int[] denemedizi=new int[3];
       //manuelkopyalama
        /*for (int index=0;index< anadizi.length;index++){
            kopyadizi[index]=anadizi[index];
        }*/
        //arraycopy yöntemi
        System.arraycopy(anadizi,0,kopyadizi,0,anadizi.length-1);
        diziyazdır(kopyadizi);
        //aşağıdaki yöntem dizinin elemanlarını değil dizinin referansını kopyalar
        System.out.println("kopylamadan önce denemedizisi: ");
        diziyazdır(denemedizi);
        System.out.println("atandıktan sonra deneme dizi: ");
        denemedizi=anadizi;
        diziyazdır(denemedizi);
        anadizi[0]+=5;
        anadizi[1]+=5;
        System.out.println("anadizinin elemanları değiştikden sonra deneme dizisi");
        diziyazdır(denemedizi);//burda göründüğü gibi deneme dizisini ana diziye eşitledikten sonra ana diziyi değiştirdiğimizde deneme dizisi de değişiyor.

    }
    public static void diziyazdır(int[]dizi){
        for(int i:dizi)
            System.out.println(i);
    }
}
