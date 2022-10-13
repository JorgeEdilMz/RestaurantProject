package co.edu.uptc.logic;

import co.edu.uptc.SimpleList.SimpleList;
import co.edu.uptc.entity.Client;


public class WaitingZone {

    SimpleList<Client> students;

    //TODO: generate random number (3-8)
    public int calculateWalkTime(){
        return (int) (Math.random()*3)+5;
    }

    //TODO create node with student and calculateAttentionTime
    public void addStudentZone(Client student){
        students.add(student);

    }
    //TODO run list and compare actual hour with node.exit
    public Client freeStudent(Client student){
        return null;
    }

}
