import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.Kitchenware;
import co.edu.uptc.logic.ControllerPaymentPoint;
import co.edu.uptc.logic.ControllerService;
import co.edu.uptc.logic.WaitingZone;
import co.edu.uptc.models.Pile;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Pile<Kitchenware> l = new Pile<Kitchenware>();
        l.add(new Kitchenware("K"+1));
        l.add(new Kitchenware("K"+2));
        l.add(new Kitchenware("K"+3));
        l.add(new Kitchenware("K"+4));
        l.add(new Kitchenware("K"+5));
        l.add(new Kitchenware("K"+6));
        l.add(new Kitchenware("K"+7));
        l.add(new Kitchenware("K"+8));
        l.add(new Kitchenware("K"+9));
        l.add(new Kitchenware("K"+10));
        l.add(new Kitchenware("K"+11));

        ControllerPaymentPoint paymentPoint = new ControllerPaymentPoint("P1");
        WaitingZone w = new WaitingZone();
        ControllerService serve = new ControllerService(l);
        for (int i = 1; i <= 10; i++) {
            System.out.println(serve.releaseClient(w.freeClient(paymentPoint.freeClient(new Client("E"+i)))));
        }System.out.println(paymentPoint.getFinancialFund());
    }            
}

