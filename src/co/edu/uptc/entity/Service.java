package co.edu.uptc.entity;

import co.edu.uptc.models.Pile;
import co.edu.uptc.models.Queue;

public class Service {

    Queue<Client> students;
    Pile<Kitchenware> lunchs;

    public Service() {
        students = new Queue<Client>();
        // lunchs = new Pile<Kitchenware>();
    }

    public Queue<Client> getStudents() {
        return students;
    }

    public void setStudents(Queue<Client> students) {
        this.students = students;
    }

    // public Pile<Kitchenware> getLunchs() {
    //     return lunchs;
    // }

    // public void setLunchs(Pile<Kitchenware> kitchen) {
    //     this.lunchs = kitchen;
    // }
}
