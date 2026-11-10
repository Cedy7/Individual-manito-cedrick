package com.joysistvi.day23.polymorphism.methodoverriding;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal("Mamal Animal", 3);
//        Cat cat = new Cat("mingming", 2, "White");
//        Dog dog = new Dog("bantay", 3, "Aspin");
////        Puppy puppy = new puppy();
//
//        System.out.println("=== Animal ===");
//        System.out.println(animal);
//        animal.eat();
//        animal.makeSound();
//
//        System.out.println("\n=== Dog ===");
//        System.out.println(dog);
//        dog.eat(); // inherited from animal
//        dog.makeSound(); // override in dog
//        dog.fetch(); // only Dog has this
//
//        System.out.println("\n=== Cat === ");
//        System.out.println(cat);
//        cat.eat(); // inherited from Animal
//        cat.makeSound(); // override in Cat
//        cat.scratch();// only Cat has this

//  animal = initiator, object = dog, consturtor = dog
        Animal dog = new Dog("Bantay", 5, "Aspin");

        // Runtime Polymorphism
        Animal cat = new Cat("Bantay", 5, "Aspin");




    }

}
