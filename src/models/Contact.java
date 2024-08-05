package models;

public class Contact {
    private String name;
    private Integer number;

    public Contact(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contact{ " + "name = " + name +", number = " + number + '}';
    }
}
