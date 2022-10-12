package co.edu.uptc.logic;

import co.edu.uptc.SimpleList.SimpleList;
import co.edu.uptc.entity.PaymentPoint;
import co.edu.uptc.entity.Service;
import co.edu.uptc.entity.Client;

import java.util.Queue;

public class Manager {

    private Service service;
    private SimpleList<PaymentPoint> paymentPoints;
    private Queue<Client> students;
    private int countStudent;
    private int countPaymentPoints;
    private boolean isStart;

    public Client instanceStudent(){
        return null;
    }

    public PaymentPoint instancePaymentPoint(){
        return null;
    }

    //TODO: generate random number (5-10)
    public int calculateStudentTime(){
        return 0;
    }

    //TODO
    private boolean isWaiting(){
        return false;
    }

    //TODO verify components service
    private void startBusiness(){

    }

    private void stopBusiness(){

    }
    //TODO verify components service
    public void servePaymentPoint(){

    }

    //TODO while true
    public void initStart(){

    }
}
