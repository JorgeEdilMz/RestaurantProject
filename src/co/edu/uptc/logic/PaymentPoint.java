package co.edu.uptc.logic;

import co.edu.uptc.entity.Student;

import java.time.LocalTime;

public class PaymentPoint {

    private Student student;
    private final char name = 'P';
    private double financialFund;
    boolean isAvailable;

    //TODO: generate random number (5-15)
    public int calculateAttentionTime(){
        return 0;
    }
    //TODO  compare actual date with exit time
    private boolean isWaiting(){
        return false;
    }

    public LocalTime exitTime(){
        return LocalTime.now().plusSeconds(calculateAttentionTime());
    }
    //TODO Modified student(payment point) and available =  true
    public Student freeStudent(Student student){
        return null;
    }

    public void pay(){
        financialFund += 2_800;
    }

    //TODO all
    public Student serveStudent(Student student){
        return null;
    }


}
