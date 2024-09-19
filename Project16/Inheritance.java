package Project16;

public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Person person = new Person();
        teacher.name = "Anik";
        teacher.gender = "Male";
        teacher.age = 30;
        teacher.Qualification = "Msc is cse";
        teacher.DisplayInformation2();

        System.out.println();
        student.name = "Hanif";
        student.gender = "Male";
        student.age = 19;
        student.id = 1125;
        student.cgpa = 3.18;
        student.Qualification = "cse";
        student.DisplayInformation3();

        System.out.println();
        person.name = "apu";
        person.age = 40;
        person.gender = "Male";
        person.DisplayInformation1();
    }
}
