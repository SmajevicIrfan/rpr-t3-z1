package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;

public class Imenik {
    private Map<String, TelefonskiBroj> phonebook;

    public Imenik() {
        phonebook = new HashMap<>();
    }

    public void dodaj(String ime, TelefonskiBroj broj) {
        phonebook.put(ime, broj);
    }

    public String dajBroj(String ime) {
        TelefonskiBroj telefonskiBroj = phonebook.get(ime);
        return telefonskiBroj == null ? null : telefonskiBroj.ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : phonebook.entrySet()) {
            if (entry.getValue().compareTo(broj) == 0) {
                return entry.getKey();
            }
        }

        return null;
    }
    
}
