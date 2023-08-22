
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PojistenecManagement {

    private List<Pojistenec> pojistenci;

    public PojistenecManagement() {
        pojistenci = new ArrayList<>();
    }

    /**
     * Metoda pro zaevidování nových pojištěnců.
     * Každá instance pojištěnce se při použití metody uloží do kolekce pojistenci.
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telCislo
     */
    public void pridejPojistence (String jmeno, String prijmeni,int vek,int telCislo) {
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telCislo);
        pojistenci.add(pojistenec);
        System.out.println();
        System.out.println("Uživatel přidán...");
        System.out.println();

    }

    /**
     * Metoda pro smazání zaevidovaného pojištěnce. Pokud není zadaný pojištěnec v kolekci pojistenci výjimka
     * vypíše, že uživatel neexistuje a vypíše chybu.
     * @param zadani Pro výpis je nutné zadat ID pojištěnce.
     */

    public void smazatUzivatele(int zadani) {
        try{
            pojistenci.remove(zadani);
            System.out.println("Uživatel s ID " + zadani + " byl smazán.");
            System.out.println();
        }catch(Exception e){
            System.out.println("Uživatel s ID " + zadani + " neexistuje! Chyba: " + e);
            System.out.println();
        }
    }

    /**
     * Metoda pro výpis všech zaevidovaných pojištěnců uložených v kolekci pojistenci.
     */
    public void vsichniUzivatele() {
        int id = 0;
        for (Pojistenec pojistenec : pojistenci) {
            System.out.println();
            System.out.println("ID: "+ id);
            System.out.println("Celé jmeno: " + pojistenec.getJmeno() + " " + pojistenec.getPrijmeni());
            System.out.println("Věk: " + pojistenec.getVek());
            System.out.println("Tel. číslo:  " + pojistenec.getTelCislo());
            System.out.println();
            id++;
        }
    }

    /**
     * Metoda pro vyhledání pojištěnce. Cyklus projede celou koleci pojistenci a vyhledá pojištěnce se stejným jménem nebo přijmením.
     * Metoda dokaže najít pojištěnce i při zadání části jména nebo přijmení.
     * @param hledaneJmeno
     */
    public void vyhledejPojisteneho(String hledaneJmeno) {
        System.out.println();
        boolean nalezeno = false;
        for (Pojistenec pojistenec : pojistenci){
            if(pojistenec.getJmeno().toLowerCase().contains(hledaneJmeno.toLowerCase())||
                    pojistenec.getPrijmeni().toLowerCase().contains(hledaneJmeno.toLowerCase())){
                System.out.println("Pojištěnec nalezen: ");
                System.out.println();
                System.out.println("Celé jmeno: " + pojistenec.getJmeno() + " " + pojistenec.getPrijmeni());
                System.out.println("Věk: " + pojistenec.getVek());
                System.out.println("Tel. číslo:  " + pojistenec.getTelCislo());
                System.out.println();
                nalezeno = true;
            }
        }
        if(!nalezeno){
            System.out.println("Pojištěnec nebyl nalezen.");
        }
    }

}
