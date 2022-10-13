package co.edu.uptc.entity;

import java.time.LocalDateTime;


public class Client extends Person{

    private String paymentPoint;
    private Kitchenware kitchenware;
    private LocalDateTime time;

    public Client(String name) {
        super(name);
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime localDate) {
        this.time = localDate;
    }

    @Override
    public String toString() {
        return "Student{" + getName() +
                ", paymentPoint='" + paymentPoint + '\'' +
                ", kitchenware=" + kitchenware +
                '}';
    }
}
