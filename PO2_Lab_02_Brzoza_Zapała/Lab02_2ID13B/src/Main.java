import java.sql.Time;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj dlugosc tablicy przechowujacej informacje o pacjentach: ");
        Scanner scanner = new Scanner(System.in);

        Pacjent[] pacjenci = new Pacjent[scanner.nextInt()];

        Przychodnia przychodnia = new Przychodnia(pacjenci);

        Pacjent pacjent1 = new Pacjent( "Jan", "Wał", (short) 45, true, 123456789l, 123456789l);
        Pacjent pacjent2 = new Pacjent( "Weronika", "Zaleśna", (short) 20, false, 123456700l, 123456700l);
        Pacjent pacjent3 = new Pacjent( "Adrian", "Żmijewski", (short) 21, true, 123456701l, 123456701l);


        przychodnia.dodajPacjent(pacjent1);
        przychodnia.dodajPacjent(pacjent2);
        przychodnia.dodajPacjent(pacjent3);

        przychodnia.usunPacjent("Weronika", "Zaleśna", 123456700L);

        przychodnia.dodajPacjent(pacjent3);
        przychodnia.wyswietlPacjentow();

        przychodnia.wyswietlPo("Weronika", "Zaleśna",123456700l);
        przychodnia.wyswietlPo("Adrian", "Żmijewski",123456701l);

    }
}
