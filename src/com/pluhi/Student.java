package com.pluhi;

import java.util.HashMap;
import java.util.Map;


public class Student {
    Map<Integer, String> znamky = new HashMap<Integer, String>(); //sposob ako pridat k znamkam aj predmet

    private final int rocnik;
    private final String meno;
    private int znamka;

    //bolean jeBakalar
    //bolean jeInzinier


    public Student(String meno, int rocnik) {
        this.meno = meno;
        this.rocnik = rocnik;
        //kontrola mena a rocnika

    }

    public void vypis() {
        System.out.printf("Meno studenta: %s%n%s%s%n", meno, "Rocnik: ", rocnik);

        if (rocnik > 0 && rocnik < 4)
            System.out.println(meno + " je bakalar");

        if (rocnik > 3 && rocnik < 6) {
            System.out.println(meno + " je inzinier");

        }
    }

    public boolean vlozZnamku(int znamka) {
        //over ci dany predmet existuje v danom mape
        //ked neexistuje musim vlozit novy zaznam

        if (znamka > 0 && znamka < 6) {
            znamky.put(1, "Matematika"); //HashMap put
            return true;
        } else {
            System.out.println("Neplatny rozsah");
            return false;
        }

//        return znamka <= 5;
    }

    public void vypisVsetkyZnamky() {


//        znamky.add(0, znamka);
//        znamky.add(1, znamka);
//        znamky.add(2, znamka);
//        znamky.add(3, znamka);
//        znamky.add(4, znamka);
//        znamky.add(5, znamka);
//        znamky.add(6, znamka);
//        znamky.add(7, znamka);
//        znamky.add(8, znamka);
//        znamky.add(9, znamka);
//
        //for cyklus


        System.out.print(znamky + "  \n\n");
    }

}





