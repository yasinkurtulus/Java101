package Udemy.Bolum11.VeterinerSim;

public class Kedi extends Hayvan{
    private String tur;
    private String cins;
    private int asiSayisi;

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }


    public Kedi(String dogumYili, String isim, int asiSayisi, String cins) {
        super(dogumYili, isim);
        this.asiSayisi=asiSayisi;
        this.tur="kedi";
        this.cins=cins;
    }

    public int getAsiSayisi() {
        return asiSayisi;
    }

    public void setAsiSayisi(int asiSayisi) {
        this.asiSayisi = asiSayisi;
    }

    @Override
    void asiyap() {
        asiSayisi++;
        System.out.println(getIsim()+" isimli kediye aşı yapılmıştır. Toplam Aşı sayısı:"+asiSayisi);
    }

    @Override
    void bilgilerigoster() {
        System.out.println("Cins:"+getCins()+" Doğum yılı:"+getDogumYili()+
                "\n İsim:"+getIsim()+" Tür:"+getTur()+" Aşı sayısı:"+getAsiSayisi());
    }
}
