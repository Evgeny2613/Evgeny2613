package Homework.HW2;

public class Dog extends Animal{
    public Dog(String nick, double weight) {
        super(nick, weight);
    }

    public void bark() {
        System.out.println("Dog " + getNick() + " says: bow");
    }
}
