package co.edu.uptc.logic;
import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.Kitchenware;
import co.edu.uptc.models.Pile;
import co.edu.uptc.models.Queue;


public class ControllerService {

    Queue<Client> queueToLunch;
    Pile<Kitchenware> lunchs;

    public ControllerService(Pile<Kitchenware> lunchs) throws InterruptedException {
        this.lunchs = lunchs;
        queueToLunch = new Queue<>();
    }
    private int calculateServiceTime(){
        return (int) (Math.random()*10)+5;
    }
    private void addClientToQueue(Client student){
        if(student!=null){
            queueToLunch.add(student);
        }
    }
    private boolean isEmptyLunchs(){
        return queueToLunch.getSize()==0?true:false;
    }

    public Client releaseClient(Client student) throws InterruptedException{
        Client served = null;
        if(student!=null){
            addClientToQueue(student);
            serveStudent();
            served = queueToLunch.getFirst().getInformation();
            queueToLunch.removeFirst();
        }
        return served;
    }
    private void serveStudent() throws InterruptedException{
        Client next =queueToLunch.getFirst().getInformation();
        if(next!=null&&!isEmptyLunchs()){
            Thread.sleep(this.calculateServiceTime()* 1000L);
            next.setKitchenware(lunchs.getRecenter().getInformation().getName());
            lunchs.removeRecenter();
        }
    }
}
