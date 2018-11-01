package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        TRAVNIK("030"),
        ORASJE("031"),
        ZENICA("032"),
        SARAJEVO("033"),
        LIVNO("034"),
        TUZLA("035"),
        MOSTAR("036"),
        BIHAC("037"),
        GORAZDE("038"),
        SIROKIBRIJEG("039"),
        BRCKO("049");

        private final String callNumber;

        Grad (String pozivniBroj) {
            this.callNumber = pozivniBroj;
        }

        public String getPozivniBroj() {
            return this.callNumber;
        }
    }

    public Grad getGrad() {
        return city;
    }

    private Grad city;

    public String getBroj() {
        return number;
    }

    private String number;

    public FiksniBroj(Grad grad, String broj) {
        this.city = grad;
        this.number = broj;
    }

    @Override
    public String ispisi() {
        return String.format("%s/%s", this.city.getPozivniBroj(), this.number);
    }


}
