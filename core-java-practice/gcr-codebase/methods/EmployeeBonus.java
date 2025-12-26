public class EmployeeBonus {
    public static void main(String[] args) {
        // Step 1: Generate salary and years of service
        double[][] employeeData = generateEmployeeData();
        //Calculate new salary and bonus
        double[][] updatedData = calculateBonusAndSalary(employeeData);
        //Display results and totals
        displaySalary(employeeData, updatedData);
    }
    // generate salary & years of service
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 10) + 1;       // 1 to 10 years
        }
        return data;
    }
    // calculate bonus and new salary
    public static double[][] calculateBonusAndSalary(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;
            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;
            result[i][1] = bonus;
            result[i][0] = salary + bonus;
        }
        return result;
    }
    // display table and totals
    public static void displaySalary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp  OldSalary  Years  Bonus   NewSalary");
        for (int i = 0; i < 10; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%2d   %.0f     %.0f    %.0f    %.0f\n",(i + 1), oldSalary, years, bonus, newSalary);
        }
        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }
}
