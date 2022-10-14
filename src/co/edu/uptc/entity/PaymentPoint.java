package co.edu.uptc.entity;


public class PaymentPoint {

    private Client clientWaiting;
    private String name;

    public PaymentPoint(String name) {
        this.name = name;
    }

    public Client getClientWaiting() {
        return clientWaiting;
    }

    public void setClientWaiting(Client clientWaiting) {
        this.clientWaiting = clientWaiting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
