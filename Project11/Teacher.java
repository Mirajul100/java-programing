package Project11;

public class Teacher {
    String name;
    int phone;
    String gender;

    Teacher() {
        System.out.println("Not Information is here");
        System.out.println();
    }

    Teacher(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    Teacher(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    void DisplayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone Number is : " + phone);
        System.out.println();
    }
}
