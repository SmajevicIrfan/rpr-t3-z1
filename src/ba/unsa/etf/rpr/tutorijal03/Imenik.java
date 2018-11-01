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

    public String naSlovo(char s) {
        StringBuilder ret = new StringBuilder();

        int counter = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : phonebook.entrySet()) {
            if (entry.getKey().charAt(0) == s) {
                ret.append(String.format("%d. %s - %s\n", counter, entry.getKey(), entry.getValue().ispisi()));
                counter++;
            }
        }

        return ret.toString();
    }
}
