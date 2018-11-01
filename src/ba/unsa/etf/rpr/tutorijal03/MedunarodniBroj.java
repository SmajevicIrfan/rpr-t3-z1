package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String countryCode;
    private String number;

    public MedunarodniBroj(String drzava, String broj) {
        this.countryCode = drzava;
        this.number = broj;
    }

    @Override
    public String ispisi() {
        return String.format("%s %s", this.countryCode, this.number);
    }
}
