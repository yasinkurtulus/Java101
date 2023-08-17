package Udemy.KonuBasliklari.NesneYonelimli;

public class Static_Kavramı {
    public static void main(String[] args) {
        Memur m1=new Memur();
        m1.setIsim("Yasin");
        m1.setMaas(80000);
        System.out.println("İsim:"+m1.getIsim()+" Maaş:"+m1.getMaas());
        Memur m2=new Memur();
        m1.olusturlanmemursayisigöster();



    }
}
class Memur{
    private String isim;
    private int maas;
    static int olusturulanMemurNesnesi;

    public Memur(){
        olusturulanMemurNesnesi++;
    }


    public void setIsim(String isim){
        this.isim=isim;
    }
    public String getIsim(){
        return isim;
    }
    public void setMaas(int maas){
        if (maas<0)
            this.maas=0;
        this.maas=maas;
    }
    public  int getMaas(){
        return maas;
    }
    public   void olusturlanmemursayisigöster(){
        kanunusoyle();
        System.out.println(olusturulanMemurNesnesi);
    }
    public static void   kanunusoyle(){
        System.out.println("kanun 543");
    }

}

