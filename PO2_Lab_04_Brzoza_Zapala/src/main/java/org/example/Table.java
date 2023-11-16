package org.example;

import java.util.Random;

public class Table {

    int wiersze;
    int kolumny;
    int[][] table;


    public Table(int wiersze, int kolumny){
        this.wiersze = wiersze;
        this.kolumny = kolumny;

        this.table = new int[wiersze][kolumny];
    }


    public void wypelnijRandom(){
        for(int i = 0; i < wiersze; i++){
            Random random = new Random();
            for(int j = 0; j < kolumny; j++){
                table[i][j] = random.nextInt(1001);
            }
        }
    }

    public void wyswietlTab(){
        for(int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                System.out.printf(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public void sortujPoWierszach(){
        for (int i = 0; i < wiersze; i++){
            insertionSort(table[i]);
        }
    }



    public int[][] obroc(){
        int[][] newTab = new int[wiersze][kolumny];

        for (int i = 0; i < wiersze; i++){
            for (int j = 0; j < kolumny; j++){
                newTab[i][j] = table[j][i];
            }
        }

        return newTab;
    }

    public void sortujPoKolumnach(){
        table = obroc();
        for (int i = 0; i < wiersze; i++){
            insertionSort(table[i]);
        }

        table = obroc();
    }

    public void sortujPoWierszachIPoKolumnach(){
        sortujPoWierszach();
        sortujPoKolumnach();
    }
}
