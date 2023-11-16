import java.util.Objects;

public class Pacjent {


    String imie;
    String nazwisko;
    short wiek;
    boolean czyMezczyzna;
    long nrPolisy;
    long nrNfz;


    public Pacjent(String imie, String nazwisko, short wiek, boolean czyMezczyzna, long nrPolisy, long nrNfz) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.czyMezczyzna = czyMezczyzna;
        this.nrPolisy = nrPolisy;
        this.nrNfz = nrNfz;
    }

    public Pacjent(String imie, String nazwisko, long nrPolisy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrPolisy = nrPolisy;
    }

    @Override
    public String toString() {
        return this.imie + " " + this.nazwisko + " " + this.nrPolisy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacjent pacjent = (Pacjent) o;
        return nrPolisy == pacjent.nrPolisy && Objects.equals(imie, pacjent.imie) && Objects.equals(nazwisko, pacjent.nazwisko);
    }

}
