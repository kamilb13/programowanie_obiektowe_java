import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kasa {
    public int[] bilon;
    public int[] banknoty;
    public float[] nominaly = {0.01f, 0.02f, 0.05f, 0.1f, 0.2f, 0.5f, 1, 2, 5, 10, 20, 50, 100, 200, 500};
    public float saldo;
    public Kasa() {
        this.bilon = new int[9];
        this.banknoty = new int[6];
        this.saldo = 0;
    }

    public void wyswietlZawartosc(){
        System.out.println("BILON: ");
        for (int moneta : this.bilon){
            System.out.println(moneta);
        }

        System.out.println("\n\nBANKNOTY: ");
        for (int banknot : this.banknoty){
            System.out.println(banknot);
        }
    }

    public void wydaniePieniedzy(){

        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("Wybierz wartość którą chcesz wydac lub zakoncz operacje: \n0. ZAKOŃCZ \n1. 0.01zł " +
                    "\n2. 0.02zł \n3. 0.05zł \n4. 0.10zł \n5. 0.20zł " +
                    "\n6. 0.50zł \n7. 1zł \n8. 2zł \n9. 5zł \n10. 10zł " +
                    "\n11. 20zł \n12. 50zł \n13. 100zł \n14. 200zł \n15. 500zł");

            wybor = scanner.nextInt();

            switch (wybor){
                case 0:
                    return;
                case 1:
                    if(bilon[0] > 0){
                        bilon[0]--;
                        saldo -= 0.01f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 2:
                    if(bilon[1] > 0){
                        bilon[1]--;
                        saldo -= 0.02f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 3:
                    if(bilon[2] > 0){
                        bilon[2]--;
                        saldo -= 0.05f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 4:
                    if(bilon[3] > 0){
                        bilon[3]--;
                        saldo -= 0.10f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 5:
                    if(bilon[4] > 0){
                        bilon[4]--;
                        saldo -= 0.2f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 6:
                    if(bilon[5] > 0){
                        bilon[5]--;
                        saldo -= 0.5f;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 7:
                    if(bilon[6] > 0){
                        bilon[6]--;
                        saldo -= 1;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 8:
                    if(bilon[7] > 0){
                        bilon[7]--;
                        saldo -= 2;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 9:
                    if(bilon[8] > 0){
                        bilon[8]--;
                        saldo -= 5;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 10:
                    if(banknoty[0] > 0){
                        banknoty[0]--;
                        saldo -= 10;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 11:
                    if(banknoty[1] > 0){
                        banknoty[1]--;
                        saldo -= 20;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 12:
                    if(banknoty[2] > 0){
                        banknoty[2]--;
                        saldo -= 50;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 13:
                    if(banknoty[3] > 0){
                        banknoty[3]--;
                        saldo -= 100;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 14:
                    if(banknoty[4] > 0){
                        banknoty[4]--;
                        saldo -= 200;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                case 15:
                    if(banknoty[5] > 0){
                        banknoty[5]--;
                        saldo -= 500;
                    } else {
                        System.out.println("Brak nominału w kasie");
                    }
                    break;
                default:
                    System.out.println("Nieznany wybór");
                    break;
            }
        } while (wybor > 0);


    }


    public void przyjeciePieniedzy(){

        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("Wybierz wartość którą chcesz przyjąć lub zakoncz operacje: \n0. ZAKOŃCZ \n1. 0.01zł " +
                    "\n2. 0.02zł \n3. 0.05zł \n4. 0.10zł \n5. 0.20zł " +
                    "\n6. 0.50zł \n7. 1zł \n8. 2zł \n9. 5zł \n10. 10zł " +
                    "\n11. 20zł \n12. 50zł \n13. 100zł \n14. 200zł \n15. 500zł");

            wybor = scanner.nextInt();

            switch (wybor){
                case 0:
                    return;
                case 1:
                    bilon[0]++;
                    saldo += 0.01f;
                    break;
                case 2:
                    bilon[1]++;
                    saldo += 0.02f;
                    break;
                case 3:
                    bilon[2]++;
                    saldo += 0.05f;
                    break;
                case 4:
                    bilon[3]++;
                    saldo += 0.1f;
                    break;
                case 5:
                    bilon[4]++;
                    saldo += 0.2f;
                    break;
                case 6:
                    bilon[5]++;
                    saldo += 0.5f;
                    break;
                case 7:
                    bilon[6]++;
                    saldo += 1;
                    break;
                case 8:
                    bilon[7]++;
                    saldo += 2;
                    break;
                case 9:
                    bilon[8]++;
                    saldo += 5;
                    break;
                case 10:
                    banknoty[0]++;
                    saldo += 10;
                    break;
                case 11:
                    banknoty[1]++;
                    saldo += 20;
                    break;
                case 12:
                    banknoty[2]++;
                    saldo += 50;
                    break;
                case 13:
                    banknoty[3]++;
                    saldo += 100;
                    break;
                case 14:
                    banknoty[4]++;
                    saldo += 200;
                    break;
                case 15:
                    banknoty[5]++;
                    saldo += 500;
                    break;
                default:
                    System.out.println("Nieznany wybór");
                    break;
            }
        } while (wybor > 0);


    }

    public void rozmien(){
        System.out.println("Jaki nominał chcesz rozmienic?: \n0. ZAKOŃCZ \n1. 0.01zł " +
                "\n2. 0.02zł \n3. 0.05zł \n4. 0.10zł \n5. 0.20zł " +
                "\n6. 0.50zł \n7. 1zł \n8. 2zł \n9. 5zł \n10. 10zł " +
                "\n11. 20zł \n12. 50zł \n13. 100zł \n14. 200zł \n15. 500zł");

        Scanner scanner = new Scanner(System.in);

        int indeksRozmienianegoNominalu;
        int indeksWydawanegoNominalu;
        int[] kopiabilon = this.bilon;
        int[] kopiaBanknoty = this.banknoty;

        indeksRozmienianegoNominalu = scanner.nextInt();


        if (nominaly[indeksRozmienianegoNominalu - 1] > this.saldo){
            System.out.println("Brak wystarczajacej ilosci gotowki w kasie");
            return;
        }
        if(indeksRozmienianegoNominalu  < 1 || indeksRozmienianegoNominalu > 15){
            System.out.println("KONIEC - ZLY WYBOR ROZMIENIANEJ");
            return;
        }



        float rozmienianyNominal = nominaly[indeksRozmienianegoNominalu - 1];

        do {
            System.out.println("Jakie nominały chcesz wydac?: \n0. ZAKOŃCZ \n1. 0.01zł " +
                    "\n2. 0.02zł \n3. 0.05zł \n4. 0.10zł \n5. 0.20zł " +
                    "\n6. 0.50zł \n7. 1zł \n8. 2zł \n9. 5zł \n10. 10zł " +
                    "\n11. 20zł \n12. 50zł \n13. 100zł \n14. 200zł \n15. 500zł");

            indeksWydawanegoNominalu = scanner.nextInt();

            if(indeksWydawanegoNominalu  < 1 || indeksWydawanegoNominalu > 15){
                System.out.println("KONIEC - ZLY WYBOR WYDAWANYCH");
                return;
            }

            if (indeksRozmienianegoNominalu < 10){
                if(kopiabilon[indeksWydawanegoNominalu] > 0) kopiabilon[indeksWydawanegoNominalu - 1]--;
            } else {
                if(kopiaBanknoty[indeksRozmienianegoNominalu - 9] > 0) kopiaBanknoty[indeksWydawanegoNominalu - 9]--;
            }

            rozmienianyNominal -= nominaly[indeksWydawanegoNominalu - 1];

        } while (rozmienianyNominal > 0);

        bilon = kopiabilon;
        banknoty = kopiaBanknoty;
    }
}
