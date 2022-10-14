package co.edu.uptc.logic;

import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.PaymentPoint;

import java.time.LocalTime;

public class ControllerPaymentPoint {

    PaymentPoint paymentPoint;
    private double financialFund;
    
    public double getFinancialFund() {
        return financialFund;
    }

    boolean isAvailable;

    public ControllerPaymentPoint(String name) {
        paymentPoint = new PaymentPoint(name);
    }
    

    public int calculateAttentionTime(){
        return (int) (Math.random()*10)+5;
    }
    // private boolean isWaiting(){
    //     return false;
    // }

    public LocalTime exitTime(){
        return LocalTime.now().plusSeconds(calculateAttentionTime());
    }
    public Client freeStudent(Client student){
        student.setPaymentPoint(paymentPoint.getName());
        return student;
    }

    public void pay(){
        financialFund += 2_800;
    }

    public Client serveStudent(Client student) throws InterruptedException {
        Client client=null;
            Thread.sleep(this.calculateAttentionTime()* 1000L);
            pay();
            client = freeStudent(student);
        return client;
    }


}
