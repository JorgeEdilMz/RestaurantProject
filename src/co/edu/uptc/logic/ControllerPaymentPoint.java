package co.edu.uptc.logic;

import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.PaymentPoint;

import java.time.LocalTime;

public class ControllerPaymentPoint {

    PaymentPoint paymentPoint;
    private double financialFund;
    boolean isAvailable;

    public ControllerPaymentPoint(String name) {
        paymentPoint = new PaymentPoint(name);
    }
    

    //TODO: generate random number (5-15)
    public int calculateAttentionTime(){
        return (int) (Math.random()*10)+5;
    }
    //TODO  compare actual date with exit time
    private boolean isWaiting(){
        return false;
    }

    public LocalTime exitTime(){
        return LocalTime.now().plusSeconds(calculateAttentionTime());
    }
    //TODO Modified student(payment point) and available =  true
    public Client freeStudent(Client student){
        student.setPaymentPoint(paymentPoint.getName());
        return student;
    }

    public void pay(){
        financialFund += 2_800;
        System.out.println("xd");
    }

    //TODO all
    public Client serveStudent(Client student) throws InterruptedException {
        Client client=null;
        int i =  0;
            Thread.sleep(this.calculateAttentionTime()* 1000L);
            pay();
            client = freeStudent(student);
        return client;
    }


}
