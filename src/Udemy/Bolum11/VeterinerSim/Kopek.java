package Udemy.Bolum11.VeterinerSim;

public class Kopek extends Hayvan{
    private String tur;
    private String cins;
    private int asisayisi;

    public Kopek(String dogumYili, String isim,String cins,int asisayisi) {
        super(dogumYili, isim);
        this.tur="Köpek";
        this.cins=cins;
    }

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

    public int getAsisayisi() {
        return asisayisi;
    }

    public void setAsisayisi(int asisayisi) {
        this.asisayisi = asisayisi;
    }

    @Override
    void asiyap() {
        asisayisi++;
        System.out.println(getIsim()+" İsimli Köpeğe aşı yapıldı. Toplam aşı sayısı:"+getAsisayisi());
    }

    @Override
    void bilgilerigoster() {
        System.out.println("Tür:Köpek"+"Doğum yılı:"+getDogumYili()+" İsim:"+getIsim()+"" +
                "\nCins:"+getCins()+" Asi Sayısı:"+getAsisayisi());
    }
}
