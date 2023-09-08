package Udemy.Bolum11.VeterinerSim;

public class Veteriner extends Kisi{
    private String mezunolunanokul;
    private int calismayili;

    public Veteriner(String isim, int id,int calismayili,String mezunolunanokul) {
        super(isim, id);
        this.mezunolunanokul=mezunolunanokul;
        this.calismayili=calismayili;
    }

    public String getMezunolunanokul() {
        return mezunolunanokul;
    }

    public void setMezunolunanokul(String mezunolunanokul) {
        this.mezunolunanokul = mezunolunanokul;
    }

    public int getCalismayili() {
        return calismayili;
    }

    public void setCalismayili(int calismayili) {
        this.calismayili = calismayili;
    }

    @Override
    public void bilgilerigoster() {
        System.out.println("isim:"+getIsim()+" mezun oldupu okul:"+getMezunolunanokul()+" calisma yili:"+getCalismayili());
    }
}
