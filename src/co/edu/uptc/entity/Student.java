package co.edu.uptc.entity;

public class Student {

    private int id;
    private char name;
    private String paymentPoint;
    private Kitchenware kitchenware;

    public Student(int id, char name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public String getPaymentPoint() {
        return paymentPoint;
    }

    public void setPaymentPoint(String paymentPoint) {
        this.paymentPoint = paymentPoint;
    }

    public Kitchenware getKitchenware() {
        return kitchenware;
    }

    public void setKitchenware(Kitchenware kitchenware) {
        this.kitchenware = kitchenware;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", paymentPoint='" + paymentPoint + '\'' +
                ", kitchenware=" + kitchenware +
                '}';
    }
}
