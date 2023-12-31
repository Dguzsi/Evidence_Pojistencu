
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PojistenecManagement pojistenecManagement = new PojistenecManagement(); 
        System.out.println("-----------------------------------");
        System.out.println("Evidence pojištěnců");
        System.out.println("-----------------------------------");
        System.out.println();
        boolean exit = false;
        while (true) {
            System.out.println("Vyberte si akci:");
            System.out.println("1. Přidej uživatele");
            System.out.println("2. Vymaž uživatele");
            System.out.println("3. Vypsat všechny pojištěné");
            System.out.println("4. Vyhledej pojištěného");
            System.out.println("5. Konec");

            int volba = zadejInt(scanner);

            switch (volba) {
                case 1:
                    System.out.print("Zadejte jméno: ");
                    String jmeno = scanner.nextLine();
                    System.out.print("Zadejte příjmení: ");
                    String prijmeni = scanner.nextLine();
                    System.out.print("Zadej věk: ");
                    int vek = zadejInt(scanner);


                    System.out.println("Zadejte telefonní číslo: ");
                    int telCislo = zadejInt(scanner);
                    pojistenecManagement.pridejPojistence(jmeno, prijmeni, vek, telCislo);
                    break;
                case 2:
                    System.out.print("Zadej ID pojištěnce ke smazání: ");
                    int smazat = zadejInt(scanner);
                    pojistenecManagement.smazatUzivatele(smazat);
                    break;
                case 3:
                    pojistenecManagement.vsichniUzivatele();
                    break;
                case 4:
                    System.out.println("Zadej jméno nebo přijmení k vyhledání: ");
                    String hledaneJmeno = scanner.nextLine();
                    pojistenecManagement.vyhledejPojisteneho(hledaneJmeno);
                    break;
                case 5:
                    System.out.println("Ukončuju ... ");
                    exit = true;
                    break;
                default:
                    System.out.println("Neplatna volba.");
            }
            if(exit){
                break;
            }
        }
    }

    /**
     * Metoda pro zamezení špatného zápisu do konzole. Pokud uživatel zapíše jiný datovy typ než int,
     * vyjímka vypíše chybu a bude požadovat nový zápis dokud nebude správny.
     * @param scanner
     * @return
     */
    public static int zadejInt(Scanner scanner){
        int cislo = 0;
        while(true){
            try{
                cislo = Integer.parseInt(scanner.nextLine());
                break;
            }
            catch(Exception e){
                System.out.println("Chyba při zadávání čísla. Chyba: " + e);
            }
        }
        return cislo;
    }
}
