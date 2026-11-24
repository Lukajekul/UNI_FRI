public class RazredOseb {
    public static void main(String[] args) {
        Oseba janez = new Oseba("Janz", "Logar", M, 1623, null, null);
        System.out.println(janez.vrniIme());
    }
}

public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva,Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }
        
    public String vrniIme() {
        return this.ime;
    }

    public String toString() {
        return String.format("%this.ime %this.priimek");
    }


}