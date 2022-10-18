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
    private int countStudent;
    private int countLunchs;


    public Manager() throws InterruptedException{
        students = new Queue<Client>();
        lunchs = new Pile<>();
        cService = new ControllerService(lunchs,students);
        wZone = new WaitingZone();
        p1 = new ControllerPaymentPoint("P1");
        p2 = new ControllerPaymentPoint("P2");
        countStudent=0;
        countLunchs =0;
    }
    private void generateStudents(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void run(){
                instanceClients();
            }
        };
        timer.schedule(task, 20, calculateGenerationTime()*1000L);
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
        timer.schedule(task, 20, 5*1000L);
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
                System.out.println(students.getSize());
                continueProgram();
            }else{
                continueProgram();
            }
        }
    }
    private Client continueProgram() throws InterruptedException{
        Client finalC = cService.releaseClient(wZone.freeClient(goToFreePayPoint()));
        System.out.println(finalC);
        return finalC;
    }
    private Client goToFreePayPoint() throws InterruptedException{
        Client next = students.getFirst().getInformation();
        students.removeFirst();
        Client served=null;
        boolean areFree=p1.isFreeToUse()||p2.isFreeToUse();
        while(!areFree){
            areFree=true;
        }
        if(p1.isFreeToUse()){
            return p1.freeClient(next);
        }else if(p2.isFreeToUse()){
            return p2.freeClient(next);
        }

        return served;
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
