package co.edu.uptc.logic;

import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.PaymentPoint;

public class ControllerPaymentPoint {

    PaymentPoint paymentPoint;
    private double financialFund;
    
    public double getFinancialFund() {
        return financialFund;
    }


    public ControllerPaymentPoint(String name) {
        paymentPoint = new PaymentPoint(name);
    }
    

    public int calculateAttentionTime(){
        return (int) (Math.random()*10)+5;
    }
    // private boolean isWaiting(){
    //     return false;
    // }

    public Client freeClient(Client student) throws InterruptedException{
        serveStudent();
        student.setPaymentPoint(paymentPoint.getName());
        return student;
    }

    public void pay(){
        financialFund += 2_800;
    }

    private void serveStudent() throws InterruptedException {
            Thread.sleep(this.calculateAttentionTime()* 1000L);
            pay();
    }


}
