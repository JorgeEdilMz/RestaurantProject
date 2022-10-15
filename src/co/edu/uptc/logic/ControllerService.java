package co.edu.uptc.logic;
import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.Kitchenware;
import co.edu.uptc.entity.Service;
import co.edu.uptc.models.Pile;
import co.edu.uptc.models.Queue;


public class ControllerService {

    Service service;
    Queue<Client> queueToLunch;
    Pile<Kitchenware> lunchs;

    public ControllerService(Pile<Kitchenware> lunchs) throws InterruptedException {
        this.service = new Service();
        this.lunchs = lunchs;
        queueToLunch = service.getStudents();
    }
    private int calculateServiceTime(){
        return (int) (Math.random()*10)+5;
    }
    private void addClientToQueue(Client student){
        service.getStudents().add(student);
    }
    private boolean isEmptyLunchs(){
        return queueToLunch.getSize()==0?true:false;
    }

    public Client releaseClient(Client student) throws InterruptedException{
        addClientToQueue(student);
        serveStudent(queueToLunch.getFirst().getInformation());
        return queueToLunch.getFirst().getInformation();
    }
    private void serveStudent(Client student) throws InterruptedException{
        if(!isEmptyLunchs()){
            Thread.sleep(this.calculateServiceTime()* 1000L);
            queueToLunch.getFirst().getInformation().setKitchenware(lunchs.getRecenter().getInformation().getName());
            lunchs.removeRecenter();
        }
    }
}
