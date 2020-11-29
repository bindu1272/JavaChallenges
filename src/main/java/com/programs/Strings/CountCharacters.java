package Strings;
interface Animal{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal {
    public void animalSound() {
        System.out.println("this is animal sound method");
    }
    public void sleep(){
        System.out.println("this is sleep method");
    }
}
class CountCharacters {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
}

