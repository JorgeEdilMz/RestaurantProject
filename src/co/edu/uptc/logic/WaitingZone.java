package co.edu.uptc.logic;

import co.edu.uptc.SimpleList.SimpleList;
import co.edu.uptc.entity.Client;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
;

public class WaitingZone {

    SimpleList<Client> students;

    
    public WaitingZone() {
        this.students = new SimpleList<Client>();
    }

    private int calculateWalkTime(){
        return (int) (Math.random()*3)+5;
    }

    private void addStudentZone(Client student){
        if(student!=null){
            student.setTime(LocalDateTime.now().plusSeconds(calculateWalkTime()));
            students.add(student);
        }
    }
    public Client freeClient(Client student){
        addStudentZone(student);
        return searchTimeOverClient();
    }

    private Client searchTimeOverClient(){
        Client clientReady=null;
            if(students.size()!=0){
                for (int j = 1; j <= students.size(); j++) {
                    LocalDateTime x = students.get(j).getTime();
                    if(LocalDateTime.now().getLong(ChronoField.SECOND_OF_MINUTE)>= x.getLong(ChronoField.SECOND_OF_MINUTE)){
                        clientReady = students.get(j);
                        students.remove(j);
                    }
                
                }

            }return clientReady;
    }
}


