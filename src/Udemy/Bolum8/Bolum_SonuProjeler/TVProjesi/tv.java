package Udemy.Bolum8.Bolum_SonuProjeler.TVProjesi;

import java.util.ArrayList;

public class tv {
    private String marka;
    private int boyut;
    private int suankikanal=1;
    private  boolean acık=false;
    private int sesduzeyi;
    ArrayList<kanal>kanallar;

    public boolean isAcık() {
        return acık;
    }

    public tv(String marka, int boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar=new ArrayList<>();
        kanallariolustur();

    }
    public void kanaldegistir(int girilenkanal){
        if (girilenkanal!=suankikanal&&girilenkanal<=kanallar.size()&&girilenkanal>0){
        suankikanal=girilenkanal;
        kanallar.get(suankikanal-1).bilgilerigoster();}
        else System.out.println("Geçerli Kanal giriniz");
    }
    public void sesarttır(){
        if (sesduzeyi<20&&acık){
            sesduzeyi++;
            System.out.println("ses:"+sesduzeyi);
        }
        else System.out.println("Ses maximum düzeyde");
    }
    public void sesazalt(){
        if (sesduzeyi>0&&acık){
          sesduzeyi--;
            System.out.println("ses:"+sesduzeyi);}
        else System.out.println("ses düzeyi minimumda");
    }
    public void tvac(){
        if (acık==false){
            acık=true;
        }
        else System.out.println("tv xaten açık");
    }
    public void tvkapat(){
        if (acık==true){
            acık=false;
        }else System.out.println("tv zaten kapalı");
    }
    public void kanallariolustur(){
        haberKanalı cnn=new haberKanalı("cnn",1,"genel haber");
        kanallar.add(cnn);
        MuzikKanali kraltv=new MuzikKanali("Kraltv",2,"yerli");
        kanallar.add(kraltv);
    }
    public void kanalbilgisigoster(){
        if(acık){
            kanallar.get(suankikanal-1).bilgilerigoster();
        }
        else System.out.println("tv acık değil");
    }

    @Override
    public String toString() {
        return "Marka:"+marka+ " boyut:"+boyut;
    }
}
