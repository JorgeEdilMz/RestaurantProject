import co.edu.uptc.entity.Client;
import co.edu.uptc.logic.ControllerPaymentPoint;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ControllerPaymentPoint paymentPoint = new ControllerPaymentPoint("P1");
        for (int i = 1; i <= 5; i++) {
            System.out.println(paymentPoint.serveStudent(new Client("E"+i)));
        }

    }
}

