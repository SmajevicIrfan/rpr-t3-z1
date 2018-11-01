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
    
}
