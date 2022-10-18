package co.edu.uptc.logic;

import java.util.Timer;
import java.util.TimerTask;

import co.edu.uptc.models.Pile;
import co.edu.uptc.models.Queue;
import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.Kitchenware;

public class Manager {    
    private WaitingZone wZone;
    private ControllerPaymentPoint p1;
    private ControllerPaymentPoint p2;
    private ControllerService cService;
    private Queue<Client> students;
    private Pile<Kitchenware> lunchs;
    private int countStudent=0;
    private int countLunchs=0;


    public Manager() throws InterruptedException{
        students = new Queue<Client>();
        lunchs = new Pile<>();
        cService = new ControllerService(lunchs);
        wZone = new WaitingZone();
        p1 = new ControllerPaymentPoint("P1");
        p2 = new ControllerPaymentPoint("P2");

    }
    private void generateStudents(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                instanceClients();
            }
        };
        timer.schedule(task, 20, calculateGenerationTime()*1000);
    }

    public void instanceClients(){
        students.add(new Client("E"+(countStudent+1)));
        countStudent++;
    }
    private int calculateGenerationTime(){
        return (int) (Math.random()*3)+5;
    }
    private void generateLunchs(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                instanceLunchs();
            }
        };
        timer.schedule(task, 20, 5000);
    }

    public void instanceLunchs(){
        lunchs.add(new Kitchenware("M"+(countLunchs+1)));
        countLunchs++;
    }

    public void startBusiness() throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            if(students.getSize()==0){
                while(students.getSize()==0){
                    generateStudents();
                }
                while(lunchs.getSize()==0){
                    generateLunchs();
                }
                continueProgram();
            }else{
                continueProgram();
            }
        }
    }
    private void continueProgram() throws InterruptedException{
        Client clientGoing = cService.releaseClient(wZone.freeClient(attend()));
        if(clientGoing!=null){
            System.out.println(clientGoing);
        }
    }
    private Client attend() throws InterruptedException{
        clasificate();
        Client goOut=students.getFirst().getInformation();
        students.removeFirst();
        return goOut;
    }
    
    private void clasificate() throws InterruptedException{
        if(p1.isFreeToUse()){
            p1.freeClient(students.getFirst().getInformation());
        }else if(p2.isFreeToUse()){
            p2.freeClient(students.getFirst().getInformation());
        }
    }
    // private void stopBusiness(){

    // }
    public static void main(String[] args) {
        try {
            Manager m = new Manager();
            m.startBusiness();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
