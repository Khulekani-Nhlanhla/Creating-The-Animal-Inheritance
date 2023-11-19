public abstract class Animal {
    String nameNhlanhla64896;
    int ageNhlanhla64896;
    int weightNhlanhla64896;

    public Animal(String name, int age, int weight) {
        this.nameNhlanhla64896 = name;
        this.ageNhlanhla64896 = age;
        this.weightNhlanhla64896 = weight;
    }

    public Animal(String name,int age){
        this.nameNhlanhla64896 = name;
        this.ageNhlanhla64896 = age;
    }



     abstract void eatNhlanhla64896();
    abstract void getVoiceNhlanhla64896();

}

class Mammal extends Animal {
    public Mammal(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }
}
class Bird extends Animal{
    String featherColor;

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }
}
class Fish extends Animal{
    public Fish(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Fish(String name, int age) {
        super(name, age);
    }
}
class Dog extends Mammal{
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
class Blowfish extends Fish{
    public Blowfish(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Blowfish(String name, int age) {
        super(name, age);
    }
}
class Pigeon extends Bird{
    String Species;

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        Species = species;
    }

    public Pigeon(String name, int age, String featherColor, String species) {
        super(name, age, featherColor);
        Species = species;
    }
}