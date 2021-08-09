package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students wish to add
        System.out.println("Enter Number of Students want to add : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Student[] students = new Student[num];

        //Create students
        for (int n = 0; n < num; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n = 0; n < num; n++) {
            System.out.println(students[n].toString());
        }

    }
}
