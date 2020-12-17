package com.pluhi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    Map<String, ArrayList<Integer>> znamky = new HashMap<>();

    private final int rocnik;
    private final String meno;


    public Student(String meno, int rocnik) {
        this.meno = meno;
        this.rocnik = rocnik;

    }

    public boolean stupenStudenta() {
        if (rocnik > 0 && rocnik < 4) {
            System.out.println("Student " + meno + " je bakalar.");
        } else if (rocnik > 3 && rocnik <= 5) {
            System.out.println("Student " + meno + " je inzinier.");
        } else
            System.out.println("Rocnik je neznamy.");
        return true;
    }

    public void vypis() {
        System.out.println("Meno studenta: " + meno);
        System.out.println("Rocnik: " + rocnik);
        System.out.println(stupenStudenta());

    }

    public void vypisZnamky() {
        for (Map.Entry<String, ArrayList<Integer>> vstup : znamky.entrySet()) {
            System.out.print(vstup.getKey() + " | ");
            for (int predmZ : vstup.getValue()) {
                System.out.print(predmZ + " ");
            }
            System.out.println();
        }
    }

    public void vlozZnamky(String predmet, int pocetZnamok) {

        Random rn = new Random();
        ArrayList<Integer> udeleneZnamky = new ArrayList<>();
        for (int i = 0; i < pocetZnamok; i++) {
            udeleneZnamky.add(rn.nextInt(5) + 1); //s tymto zabezpecujem abz znamky boli z intervalu 1-5
        }
        znamky.put(predmet, udeleneZnamky);

    }

    public double vypocitajPriemer(String predmet) {
        double sum = 0;
        double priemer = 0;

        for (Integer number : this.znamky.get(predmet)) {
            sum += number;
        }

        if (this.znamky.get(predmet).size() != 0) priemer = sum / this.znamky.get(predmet).size();

        return priemer;
    }

}










