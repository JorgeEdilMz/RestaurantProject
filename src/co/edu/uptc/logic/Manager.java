package co.edu.uptc.logic;

import co.edu.uptc.SimpleList.SimpleList;
import co.edu.uptc.entity.PaymentPoint;
import co.edu.uptc.entity.Service;
import co.edu.uptc.models.Queue;
import co.edu.uptc.entity.Client;

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

    public int calculateStudentTime(){
        return 0;
    }

    private boolean isWaiting(){
        return false;
    }

    private void startBusiness(){

    }

    private void stopBusiness(){

    }
    public void servePaymentPoint(){

    }

    public void initStart(){

    }
}
