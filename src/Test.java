import co.edu.uptc.entity.Client;
import co.edu.uptc.logic.ControllerPaymentPoint;
import co.edu.uptc.logic.WaitingZone;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ControllerPaymentPoint paymentPoint = new ControllerPaymentPoint("P1");
        WaitingZone w = new WaitingZone();
        for (int i = 1; i <= 5; i++) {
            System.out.println(w.freeClient(paymentPoint.freeClient(new Client("E"+i))));
        }System.out.println(paymentPoint.getFinancialFund());
    }            

}

