class Person{
    String name;
    int age;
    //parameterized constructor
    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Person(Person p) {
        this.name=p.name;
        this.age=p.age;
    }
    void display() {
        System.out.println("Name: " +name+", Age: "+age);
    }
    public static void main(String[] args) {
        Person p1=new Person("Sarthak", 21);
        // cloning p1 to p2
        Person p2 =new Person(p1);
        p2.display();
    }
}
