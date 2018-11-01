package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {

    private int mobileNetwork;
    private String number;
    
    public MobilniBroj(int mobilnaMreza, String broj) {
        if (mobilnaMreza < 60 || mobilnaMreza > 67)
            throw new IllegalArgumentException("Zadata mobilna mreza ne postoji");

        this.mobileNetwork = mobilnaMreza;
        this.number = broj;
    }
    
    @Override
    public String ispisi() {
        return String.format("0%d/%s", this.mobileNetwork, this.number);
    }
}
