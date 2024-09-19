package Project16;

public class Student extends Teacher {
    int id;
    double cgpa;

    void DisplayInformation3() {
        DisplayInformation2();
        System.out.println("Student ID is : " + id);
        System.out.println("Student Cgpa is : " + cgpa);
    }
}
