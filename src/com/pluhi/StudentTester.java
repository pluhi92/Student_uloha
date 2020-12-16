package com.pluhi;

public class StudentTester {
    public static void main(String[] args) {

        Student student = new Student("Peter Studeny", 4);
        student.vypis();

        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(5));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(5));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(5));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(4));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(3));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(5));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(1));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(2));
        System.out.println("Znamka je z intervalu 1-5: " + student.vlozZnamku(4));



        Student student1 = new Student("Karol Novak", 1);
        student1.vypis();

    }
}
