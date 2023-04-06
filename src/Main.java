import java.util.ArrayList;
import java.util.List;

interface Scheepsbouwer {
    // Voeg een nieuwe optie toe aan de lijst van beschikbare opties
    void voegOptieToe(String optie);

    // Voeg een nieuw type klant toe aan de lijst van beschikbare klanttypen
    void voegKlantTypeToe(String klantType);
}

class MyScheepsbouwer implements Scheepsbouwer {

    private List<String> opties;
    private List<String> klantTypen;

    public MyScheepsbouwer() {
        // Initialiseer de lijsten van beschikbare opties en klanttypen
        opties = new ArrayList<>();
        klantTypen = new ArrayList<>();
    }

    // Implementeer de methode om een nieuwe optie toe te voegen
    public void voegOptieToe(String optie) {
        opties.add(optie);
    }

    // Implementeer de methode om een nieuw type klant toe te voegen
    public void voegKlantTypeToe(String klantType) {
        klantTypen.add(klantType);
    }

    public static void main(String[] args) {
        MyScheepsbouwer bouwer = new MyScheepsbouwer();
        bouwer.voegOptieToe("Airconditioning");
        bouwer.voegKlantTypeToe("Jachteigenaar");
        System.out.println(bouwer.opties);
        System.out.println(bouwer.klantTypen);
    }
}
