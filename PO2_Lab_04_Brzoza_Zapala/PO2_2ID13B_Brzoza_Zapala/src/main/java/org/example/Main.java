package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Table tab = new Table(30, 30);
        tab.wypelnijRandom();
        tab.wyswietlTab();

        System.out.println("\n");

        //tab.sortujPoWierszach();
        //tab.wyswietlTab();

        tab.sortujPoWierszachIPoKolumnach();
        tab.wyswietlTab();
    }
}