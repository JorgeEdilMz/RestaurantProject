package co.edu.uptc.logic;

import co.edu.uptc.entity.Client;
import co.edu.uptc.entity.Service;

import java.time.LocalTime;

public class ControllerService {

    Service service;
    private final char name = 'P';

    //TODO enter student and add queue
    public void addStudentQueue(Client student){

    }
    //TODO return true if enter student is first in queue
    public boolean isFirst(Client student){
        return false;
    }

    //TODO: generate random number (5-15)
    public int calculateServiceTime(){
        return 0;
    }

    //TODO: compare actual time with exitTime and set student name, remove student, remove kitchen
    public void freeStudent(Client student){

    }

    //TODO: first ask isFirst, then calculateServiceTime and finally freeStudent
    public Client serveStudent(Client student){

        return null;
    }
}
