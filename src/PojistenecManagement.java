
import java.util.ArrayList;
import java.util.List;

public class PojistenecManagement {

    private List<Pojistenec> pojistenci;

    public PojistenecManagement() {
        pojistenci = new ArrayList<>();
    }

    /**
     *
     * @param jmeno
     * @param vek
     */
    public void pridejPojistence (String jmeno, String prijmeni,int vek,int telCislo) {
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telCislo);
        pojistenci.add(pojistenec);
        System.out.println();
        System.out.println("Uživatel přidán...");
        System.out.println();

    }


    public void smazatUzivatele(int zadani) {
        try{
            pojistenci.remove(zadani);
            System.out.println("Uživatel s ID " + zadani + " byl smazán.");
            System.out.println();
        }catch(Exception e){
            System.out.println("Uživatel s ID " + zadani + " neexistuje! " + e);
            System.out.println();
        }
    }

    public void vsichniUzivatele() {
        int docasnaPromena = 0;
        for (Pojistenec pojistenec : pojistenci) {
            System.out.println();
            System.out.println("ID: "+ docasnaPromena);
            System.out.println("Celé jmeno: " + pojistenec.getJmeno() + " " + pojistenec.getPrijmeni());
            System.out.println("Věk: " + pojistenec.getVek());
            System.out.println("Tel. číslo:  " + pojistenec.getTelCislo());
            System.out.println();
            docasnaPromena++;
        }
    }
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