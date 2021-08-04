package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 10000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student First Name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student Last Name : ");
        this.lastName = in.nextLine();

        System.out.println("1 - 1st Year\n2 - 2nd Year\n3 - 3rd Year\n4 - 4th Year\nEnter Student Year : ");
        this.year = in.nextInt();
        System.out.println(firstName+ " " + lastName + " " + year);

        id++;

    }

}
