package co.edu.uptc.logic;

import co.edu.uptc.entity.Kitchenware;
import co.edu.uptc.entity.Student;
import co.edu.uptc.models.Pile;

import java.util.Queue;

public class Service {

    Queue<Student> students;
    Pile<Kitchenware> kitchen;

    //TODO enter student and add queue
    public void addStudentQueue(Student student){

    }
    //TODO return true if enter student is first in queue
    public boolean isFirst(Student student){
        return false;
    }

    //TODO: generate random number (5-15)
    public int calculateServiceTime(){
        return 0;
    }

    //TODO: compare actual time with exitTime and set student name, remove student, remove kitchen
    public void freeStudent(Student student){

    }

    //TODO: first ask isFirst, then calculateServiceTime and finally freeStudent
    public Student serveStudent(Student student){
        return null;
    }
}
