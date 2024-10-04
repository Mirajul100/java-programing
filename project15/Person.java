package project15;

public class Person {
    private String name, gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

    public String getName() {
        return name;
    }

    // public void setAge(int age) {
    // this.age = age;
    // }

    public int getAge() {
        return age;
    }

    // public void serGender(String gender) {
    // this.gender = gender;
    // }

    public String getGender() {
        return gender;
    }

}
