package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj {

    private int mobileNetwork;
    private String number;
    
    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobileNetwork = mobilnaMreza;
        this.number = broj.clone();
    }
    
    @Override
    public String ispisi() {
        return "0" + this.mobileNetwork + "/" + this.number;
    }
}
