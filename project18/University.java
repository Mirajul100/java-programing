package project18;

public class University {
    final String NAME = "Daffodil University";
    final int fees;
    static final String address;

    University(int fees) {
        this.fees = fees;
    }

    static {
        address = "Asolia";
    }

    void display() {
        System.out.println("University Name : " + NAME);
        System.out.println("Fees is : " + fees);
        System.out.println("Address is : " + address);
    }
}
