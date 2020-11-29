package MyEncapsulation;
class Animal{
    public void animalSound(){
        System.out.println("the Animal sounds like");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("it sounds like pe pee");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println("it sounds like bow bow");
    }
}

public class Mypolymorphisim {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
