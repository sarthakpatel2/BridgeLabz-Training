class PenDistribution{
    public static void main(String[] args){
        //total pens
        int totalPens=14;
        //total students
        int totalStudents=3;
        // pen per student calculation
        int penPerStudent=totalPens/totalStudents;
        // remaining pen calculation
        int remPens=totalPens%totalStudents;
        // print output
        System.out.print("The Pen Per Student is "+penPerStudent+ " and the remaining pen not distributed is "+remPens);
    }
}
