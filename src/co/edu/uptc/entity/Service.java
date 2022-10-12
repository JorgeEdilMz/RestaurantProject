package co.edu.uptc.entity;

import co.edu.uptc.models.Pile;

import java.util.Queue;

public class Service {

    Queue<Client> students;
    Pile<Kitchenware> kitchen;

    public Service() {
    }

    public Queue<Client> getStudents() {
        return students;
    }

    public void setStudents(Queue<Client> students) {
        this.students = students;
    }

    public Pile<Kitchenware> getKitchen() {
        return kitchen;
    }

    public void setKitchen(Pile<Kitchenware> kitchen) {
        this.kitchen = kitchen;
    }
}
