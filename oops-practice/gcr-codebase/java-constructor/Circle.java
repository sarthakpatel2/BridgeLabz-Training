class Circle{
    double radius;
    //default constructor
    Circle(){
        this(1.0); // constructor chaining
    }
    // Parameterized constructor
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    void displayParameters(){
        System.out.println("Radius: "+radius);
        System.out.println("Area: " +area());
        System.out.println();
    }
    public static void main(String[] args){
        // default radius
        Circle c1 =new Circle();
        // user-provided radius
        Circle c2=new Circle(5.5);
        c1.displayParameters();
        c2.displayParameters();
    }
}
