package Udemy.Bolum8.Bolum_SonuProjeler.TVProjesi;

public class haberKanalı extends kanal {
    String haberturu;
    public haberKanalı(String isim, int no,String tur) {
        super(isim, no);
        haberturu=tur;
    }
}
