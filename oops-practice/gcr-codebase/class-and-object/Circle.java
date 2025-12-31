class Circle {
    double radius;
    void calculate() {
        double area=3.14*radius*radius;
        double circumference= 2*3.14*radius;
        System.out.printf("Area of circle: %.4f\n", area);
        System.out.printf("Circumference of circle: %.4f\n", circumference);
    }
    public static void main(String[] args){
        Circle circle=new Circle();
        circle.radius=2.5;
        circle.calculate();
    }
}
