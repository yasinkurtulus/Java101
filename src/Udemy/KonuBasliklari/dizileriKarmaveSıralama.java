package Udemy.KonuBasliklari;

public class dizileriKarmaveSıralama {
    public static void main(String[] args) {
        int[] sayilar = {1, 3, 2, -9, 78};
        diziyazdır((sayilar));
        System.out.println(" ");
        //diziyikar(sayilar);
        diziyisırala(sayilar);
        diziyazdır(sayilar);
        int sonuc = binarysearching(sayilar, 78);
        System.out.println(" ");
        System.out.println(sonuc);
    }

    //diziyi rastgele karma metodu
    public static void diziyikar(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int rastgaleindex = (int) (Math.random() * dizi.length);
            if (rastgaleindex < dizi.length) {
                //System.out.println(rastgaleindex);
                int gecicideger = dizi[rastgaleindex];
                dizi[rastgaleindex] = dizi[i];
                dizi[i] = gecicideger;
            }
        }

    }

    public static void diziyisırala(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int oankienkucuksayi = dizi[i];
            int oankienkucuksayiindex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (oankienkucuksayi > dizi[j]) {
                    oankienkucuksayi = dizi[j];
                    oankienkucuksayiindex = j;
                }
            }
            if (oankienkucuksayiindex != i) {
                dizi[oankienkucuksayiindex] = dizi[i];
                dizi[i] = oankienkucuksayi;
            }
        }

    }

    public static int binarysearching(int[] dizi, int arananasayi) {
        int enyuksekindex = dizi.length - 1;
        int endusukindex = 0;
        while (enyuksekindex >= endusukindex) {
            int ortaindex = (enyuksekindex + endusukindex) / 2;
            if (dizi[ortaindex] == arananasayi)
                return dizi[ortaindex];
            else if (dizi[ortaindex] > arananasayi) {
                endusukindex = ortaindex-1;
            } else if (dizi[ortaindex] < arananasayi) {
                endusukindex = ortaindex+1;
                return 5;
            }
            System.out.println(ortaindex);
        }

            return 0;
    }


    public static void diziyazdır(int[] dizi) {
        for (int i : dizi)
            System.out.print(i + ",");
    }}


