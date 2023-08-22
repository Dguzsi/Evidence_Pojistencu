
public class Pojistenec {

        private String jmeno;

        private String prijmeni;
        private int vek;
        private int telCislo;

        public Pojistenec(String jmeno, String prijmeni, int vek, int telCislo) { // Konstruktor pojištěnce
            this.jmeno = jmeno;
            this.prijmeni = prijmeni;
            this.vek = vek;
            this.telCislo = telCislo;
        }

        public String getJmeno() {
            return jmeno;
        }
        public String getPrijmeni(){
            return prijmeni;
        }

        public int getVek() {
            return vek;
        }

    public int getTelCislo() {
        return telCislo;
    }
}

