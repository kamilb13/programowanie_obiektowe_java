
public class Przychodnia {
     public static Pacjent[] pacjenci;


    public Przychodnia(Pacjent[] pacjenci) {
        this.pacjenci = pacjenci;
    }

    public void dodajPacjent(Pacjent pacjent){
        for (int i = 0; i < pacjenci.length; i++) {
            if(pacjenci[i] == null){
                pacjenci[i] = pacjent;
                System.out.println("Pacjent dodany");
                return;
            }
        }
        System.out.println("Brak miejsca w systemie");
    }

    public void usunPacjent(String imie, String nazwisko, long nrPolisy){
        Pacjent p = new Pacjent(imie, nazwisko, nrPolisy);
        for(int i = 0; i < pacjenci.length; i++) {
            if(p.equals(pacjenci[i])){
                pacjenci[i] = null;
                System.out.println("Pacjent usuniety");
                return;
            }
        }
        System.out.println("Brak pacjenta w liscie");
    }

    public void wyswietlPacjentow(){
        for (Pacjent p : pacjenci){
            System.out.println(p);
        }
    }

    public void wyswietlPo(String imie, String nazwisko, long nrPolisy){
        Pacjent p = new Pacjent(imie, nazwisko, nrPolisy);
        for(int i = 0; i < pacjenci.length; i++) {
            if(p.equals(pacjenci[i])){
                System.out.println("Znaleziono pacjenta: " + pacjenci[i]);
                return;
            }
        }
        System.out.println("Brak takiego pacjenta w bazie.");
    }
}
