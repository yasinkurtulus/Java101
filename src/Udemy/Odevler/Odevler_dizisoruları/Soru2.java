package Udemy.Odevler.Odevler_dizisoruları;

public class Soru2 {
    public static void main(String[] args) {
        /*Soru2 Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
        sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
        alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.*/
        int[][]dizi=new int[3][2];
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j< dizi[i].length;j++){
                int randomsayi=((int)(Math.random()*101));
                dizi[i][j]=randomsayi;
                System.out.println(dizi[i][j]);
            }
        }
        int enkucuksayi=dizi[0][0];
        int enbuyuksayi=dizi[0][0];
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                if (dizi[i][j]<enkucuksayi){
                    enkucuksayi=dizi[i][j];
                }
            }
        }
        for (int i=0;i< dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                if (dizi[i][j]>enbuyuksayi){
                    enbuyuksayi=dizi[i][j];
                }
            }
        }
        System.out.println("\n en küçük sayı: "+ enkucuksayi);
        System.out.println("\n en büyük sayı: "+ enbuyuksayi);
    }
}
