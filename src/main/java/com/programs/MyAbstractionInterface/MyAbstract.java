package MyAbstractionInterface;
abstract class Animal{
    public abstract void animalSound();
    public void sound(){
        System.out.println("Animal sounds will be capturing");
    }
}
class Pig extends Animal{
        public void animalSound() {
            System.out.println("Animal sounds");
        }
}

public class MyAbstract {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sound();
    }

}
