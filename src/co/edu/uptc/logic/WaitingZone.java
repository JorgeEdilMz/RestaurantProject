package co.edu.uptc.logic;

import co.edu.uptc.SimpleList.SimpleList;
import co.edu.uptc.entity.Client;

import java.time.LocalDateTime;
;

public class WaitingZone {

    SimpleList<Client> students;

    public int calculateWalkTime(){
        return (int) (Math.random()*3)+5;
    }

    public void addStudentZone(Client student){
        students.add(student);
        student.setTime(LocalDateTime.now().plusSeconds(calculateWalkTime()));
    }
    public Client freeClient(Client student){
        return searchTimeOverClient();
    }
    private Client searchTimeOverClient(){
        Client clientReady=null;
        for (int j = 0; j < students.size(); j++) {
            LocalDateTime x = students.get(j).getTime();
            if(LocalDateTime.now().getLong(null)<= x.getLong(null)){
                clientReady = students.get(j);
            }
        }return clientReady;
    }
}


