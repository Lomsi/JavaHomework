package Lessons.LessonEight;

public class Main {
    public static void main(String[] args) { // main is the method that runs the program
        Cat moorechka = new Cat("moorechka", 3, "white with grey spots", "Street cat"); // create a new cat object
        Pet moonCake = new Cat("moonCake", 3, "black with a single white spot", "Street cat"); // create a new cat
                                                                                               // object
        Pet Poochky = new Dog("Poochky", 6, "mainly black", "Street Dog"); // create a new dog object
        Pet rufus = new Turtle("Rufus", 6, "mainly white", "Ninja Turtle");

        Pet[] pets = { moorechka, moonCake, Poochky };
        // Object[] objects = { moorechka, moonCake, Poochky, 21, "blablala" };
        System.out.println(Poochky.makeSound());
    }
}