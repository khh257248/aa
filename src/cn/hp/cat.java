package cn.hp;

public class cat {
    private String name;
    private int age;
    private double weight;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public cat() {
    }

    public cat(String name, int age, double weight, String species, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.color = color;
    }

    private String color;

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
