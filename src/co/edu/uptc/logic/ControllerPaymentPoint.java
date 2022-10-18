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


    public void freeClient(Client student) throws InterruptedException{
        isFreeToUse = false;
        student.setPaymentPoint(paymentPoint.getName());
        serveStudent();
        isFreeToUse =true;
    }

    // public Client goToFreePayPoint(Client student) throws InterruptedException{
    //     // Client next = students.getFirst().getInformation();
    //     // students.removeFirst();
    //     // Client served=null;
    //     // boolean areFree=p1.isFreeToUse()||p2.isFreeToUse();
    //     // while(!areFree){
    //     //     areFree=true;
    //     // }
    //     Client served = student;
    //     if(this.isFreeToUse()){
    //         served =freeClient(student);
    //     }
    //     return served;
    // }
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
