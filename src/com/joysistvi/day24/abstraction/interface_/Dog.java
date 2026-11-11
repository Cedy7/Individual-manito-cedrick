package com.joysistvi.day24.abstraction.interface_;

// Don't Repeat Yourself Principle
//         rule: exdents muna bago implement
public class Dog extends Animal implements Pet, Swimmer {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // method overriding: Dog has its own verseion of makeSound()
    // implementing the abstract methods of Animal
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    // a method that only Dog has
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }




    // methods from Pen interface
    @Override
    public void play() {
        System.out.println(getName() + " plays fetch.");
    }

    @Override
    public void showAffection() {
        System.out.println(getName() + " wags its tail happily.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims in the river.");
    }

    @Override
    public String toString() {
        return "Type: Dog\n"
                + super.toString() + "\n"
                + "Breed: " + breed;
    }

}

// DRY Principle
// Don't Repeat Yourself Principle
// - this code violates the DRY Principle
// - because of code being not scalable
// - by NOT using inheritance
//public class Dog {
//
//    String name;
//    int ageInMonths;
//    String breed;
//
//
//    public void eat() {
//        System.out.println(name + " is eating.");
//    }
//
//    public void makeSound() {
//        System.out.println(name + " make a sound.");
//    }
//
//
//}
