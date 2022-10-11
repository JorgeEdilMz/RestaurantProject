package co.edu.uptc.entity;

public class Kitchenware {

    private char name;
    private int id;

    public Kitchenware(char name, int id) {
        this.name = name;
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kitchenware{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }
}
