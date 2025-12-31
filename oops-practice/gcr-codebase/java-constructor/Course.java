class Course{
    //instance variables
    String courseName;
    // in months
    int duration;
    double fee;
    // class variable
    static String instituteName="GLA University";
    // parameterized constructor
    Course(String courseName, int duration, double fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    // instance method
    void displayDetails(){
        System.out.println("Institute: "+instituteName);
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: " +duration+" months");
        System.out.println("Fee: ₹ "+fee);
        System.out.println();
    }
    // class method
    static void updateInstituteName(String newName) {
        instituteName=newName;
    }
    public static void main(String[] args) {
        Course c1 =new Course("Java Full Stack", 6,50000);
        Course c2=new Course("Python", 4,30000);
        c1.displayDetails();
        c2.displayDetails();
        //update institute name
        Course.updateInstituteName("BridgeLabz Solutions");
        c1.displayDetails();
        c2.displayDetails();
    }
}
