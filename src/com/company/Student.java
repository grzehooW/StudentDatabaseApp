package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private static int tutitionBalance;
    private int courseOfCost = 600;


    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n2 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        System.out.println(this.firstName + " " + this.lastName + " " + this.gradeYear);
    }
}
