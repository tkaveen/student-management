package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    //Constructor : Get student's f name and l name
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student Last Name : ");
        this.lastName = in.nextLine();

        System.out.print("1 - 1st Year\n2 - 2nd Year\n3 - 3rd Year\n4 - 4th Year\nEnter Student Year : ");
        this.year = in.nextInt();

        setStudentId();


    }

    //Generate student ID
    private void setStudentId() {
        id++;
        studentID = year + "" + id;
    }

    //Enroll courses
    public void enroll() {
        do {
            System.out.print("Enter Course to enroll (Press Q to Exit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //View Balance
    public void viewBalance() {
        System.out.println("Your Balance is : Rs." + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition() {
        System.out.print("Enter Payment Amount : ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank for your payment of Rs." + payment);
        viewBalance();
    }

    //Show info
    public String toString() {
        return "Name : " + firstName + " " + lastName +
                "\nLevel : " + year +
                "\nStudent ID : " + studentID +
                "\nCourses Enrolled : " + courses +
                "\nBalance : Rs." + tuitionBalance;
    }

}
