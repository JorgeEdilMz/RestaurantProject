package co.edu.uptc.entity;

public class Kitchenware {

    private String name;

    public Kitchenware(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kitchenware{" +
                "name=" + name +
                '}';
    }
}
