package co.edu.uptc.logic;

import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.PaymentPoint;

public class ControllerPaymentPoint {

    private PaymentPoint paymentPoint;
    private double financialFund;
    private boolean isFreeToUse;

    public ControllerPaymentPoint(String name) {
        paymentPoint = new PaymentPoint(name);
        isFreeToUse=true;
    }
    
    public int calculateAttentionTime(){
        return (int) (Math.random()*10)+5;
    }


    public Client freeClient(Client student) throws InterruptedException{
        isFreeToUse = false;
        serveStudent();
        student.setPaymentPoint(paymentPoint.getName());
        isFreeToUse =true;
        System.out.println("pase por aqui P"+student);
        return student;
    }

    public void pay(){
        financialFund += 2_800;
    }

    private void serveStudent() throws InterruptedException {
            Thread.sleep(this.calculateAttentionTime()* 1000L);
            pay();
    }
    public double getFinancialFund() {
        return financialFund;
    }
    public boolean isFreeToUse() {
        return isFreeToUse;
    }
}
