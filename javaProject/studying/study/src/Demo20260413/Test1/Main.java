package Demo20260413.Test1;

public class Main {
}

class Lady{
    private String name;
    private Animal pet;

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void mypetEnjoy(){

    }
}

abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void cry();
}

class Cat extends Animal{
    private String eyesColor;

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    public void cry(){

    }
}

class Dog extends Animal{
    private String furColor;

    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public void cry(){

    }
}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public void cry(){

    }
}
