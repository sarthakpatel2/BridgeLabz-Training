class Student{
    // access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;
    // constructor
    Student(int rollNumber, String name, double CGPA){
        this.rollNumber=rollNumber;
        this.name =name;
        this.CGPA=CGPA;
    }
    // public getter for CGPA
    public double getCGPA(){
        return CGPA;
    }
    // public setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA =CGPA;
    }
}
class PostgraduateStudent extends Student{
    String specialization;
    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber,name, CGPA);
        this.specialization=specialization;
    }
    void display() {
        System.out.println("Roll Number: "+rollNumber);// public
        System.out.println("Name: "+name);// protected
        System.out.println("CGPA: "+ getCGPA());// private via public getter
        System.out.println("Specialization: " +specialization);
        System.out.println();
    }
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Sarthak", 8.5, "Computer Science");
        pg.display();
        //modifying CGPA using public method
        pg.setCGPA(8.8);
        System.out.println("Updated CGPA: "+pg.getCGPA());
    }
}
