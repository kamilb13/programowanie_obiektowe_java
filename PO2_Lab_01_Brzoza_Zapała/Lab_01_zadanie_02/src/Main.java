import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Podaj slowa");
        Scanner scanner = new Scanner(System.in);
        String slowa = scanner.nextLine();
        //System.out.println("Slowo: " + slowa);
        //System.out.println("------------------");
        System.out.println("Liczba parametrow="+liczSlowa(slowa));
        System.out.print("Suma="+liczbaLiter(slowa));
        System.out.println(" Srednia="+(float)(liczbaLiter(slowa)/liczSlowa(slowa)));
        System.out.println("Najkrotsze slowo: "+najkrotszeSlowo(slowa)+" ("+najkrotszeSlowo(slowa).length()+")");
        System.out.println("Najdluzsze slowo: "+najdluzszeSlowo(slowa)+" ("+najdluzszeSlowo(slowa).length()+")");
        scanner.close();
    }

    public static int liczSlowa(String slowa){
        String[] slowaTab = slowa.split(" ");
        return slowaTab.length;
    }
    public static int liczbaLiter(String slowa){
        String[] liczbaZnakow = slowa.split("");
        int liczbaSpacji = 0;
        for(int i=0;i<slowa.length();i++){
            if(slowa.charAt(i) == ' '){
                liczbaSpacji++;
            }
        }

        return liczbaZnakow.length - liczbaSpacji;
    }
    public static String najkrotszeSlowo(String slowa){
        String[] slowaTab = slowa.split(" ");

        String najkrotsze = slowaTab[0];

        for (int i = 1; i < slowaTab.length; i++) {
            if (slowaTab[i].length() < najkrotsze.length()) {
                najkrotsze = slowaTab[i];
            }
        }

        return najkrotsze;
    }

    public static String najdluzszeSlowo(String slowa){
        String[] slowaTab = slowa.split(" ");

        String najdluzsze = slowaTab[0];

        for (int i = 1; i < slowaTab.length; i++) {
            if (slowaTab[i].length() > najdluzsze.length()) {
                najdluzsze = slowaTab[i];
            }
        }

        return najdluzsze;
    }
}