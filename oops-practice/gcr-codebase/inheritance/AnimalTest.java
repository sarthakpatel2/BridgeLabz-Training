class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat is meowing");
    }
}
class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird is chirping");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.eat();  // inherited from Animal
        dog.makeSound(); // defined in Dog

        Cat cat = new Cat();
        //cat.eat();  // inherited from Animal
        cat.makeSound(); //defined in Cat

        Bird bird=new Bird();
        //bird.eat();//inherited from Animal
        bird.makeSound();//defined in bird
    }
}
