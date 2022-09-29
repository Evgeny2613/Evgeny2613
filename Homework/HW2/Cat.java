package Homework.HW2;

public class Cat extends Animal{

    public Cat(String nick, double weight) {
        super(nick, weight);
    }

    public void Meow(){
        System.out.println("Cat " + getNick() + " says: meow");
    }
}
