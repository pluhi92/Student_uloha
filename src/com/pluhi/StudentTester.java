package com.pluhi;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student("Peter Studeny", 2);
        student.vypis();

        student.vlozZnamky("Matematika", 10);
        student.vlozZnamky("Chemia", 10);
        student.vlozZnamky("Biologia", 10);
        student.vlozZnamky("Fyzika", 10);
        System.out.println("\nUdelene znamky studenta: ");
        student.vypisZnamky();
        System.out.println("Priemer znamok z matematiky : " + student.vypocitajPriemer("Matematika"));
        System.out.println("Priemer znamok z chemie: " + student.vypocitajPriemer("Chemia"));
        System.out.println("Priemer znamok z biologie: " + student.vypocitajPriemer("Biologia"));
        System.out.println("Priemer znamok z fyziky: " + student.vypocitajPriemer("Fyzika"));

        System.out.println("--------------------------------");

        Student student1 = new Student("Karol Novak", 5);
        student1.vypis();

        student1.vlozZnamky("Matematika", 10);
        student1.vlozZnamky("Chemia", 10);
        student1.vlozZnamky("Biologia", 10);
        student1.vlozZnamky("Fyzika", 10);
        System.out.println("\nUdelene znamky studenta: ");
        student1.vypisZnamky();
        System.out.println("Priemer znamok z matematiky : " + student1.vypocitajPriemer("Matematika"));
        System.out.println("Priemer znamok z chemie: " + student1.vypocitajPriemer("Chemia"));
        System.out.println("Priemer znamok z biologie: " + student1.vypocitajPriemer("Biologia"));
        System.out.println("Priemer znamok z fyziky: " + student1.vypocitajPriemer("Fyzika"));


    }
}
