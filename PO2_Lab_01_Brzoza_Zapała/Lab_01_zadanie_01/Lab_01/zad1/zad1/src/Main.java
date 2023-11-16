
public class Main {
    public static void main(String[] args) {

      Kasa kasa = new Kasa();
//
      kasa.przyjeciePieniedzy();
//
//      kasa.wyswietlZawartosc();
//
//      kasa.wydaniePieniedzy();
//
     kasa.wyswietlZawartosc();
        System.out.println(kasa.saldo);


        kasa.rozmien();
        kasa.wyswietlZawartosc();



    }
}