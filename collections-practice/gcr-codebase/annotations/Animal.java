class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override //used override properly
    void makeSound(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args){
        Dog d=new Dog();
        d.makeSound();
    }
}
