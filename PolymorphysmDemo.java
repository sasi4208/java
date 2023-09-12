import java.io.*;
import java.util.*;
class Animal {
    public void AnimalSound()
    {
        System.out.println("An animal can make sounds");
    }
}
class Cow extends Animal{
    public void AnimalSound()
    {
        System.out.println("A cow sounds-Mao...");
    }
}
class Cat extends Animal {
    public void AnimalSound(){
        System.out.println("A cat sounds- Meow...");
    } 
}
public class polymorphismDemo{
    public static void main(String args[]){
        Animal an = new Animal();
        Cow cow = new Cow();
        Cat cat = new Cat();
        an.AnimalSound();
        cow.AnimalSound();
        cat.AnimalSound();
    }
}
