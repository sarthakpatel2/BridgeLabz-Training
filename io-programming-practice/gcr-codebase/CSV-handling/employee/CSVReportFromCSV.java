import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CSVReportFromCSV{
    public static void main(String[] args){
        String inputFile="io-programming-practice/gcr-codebase/CSV-handling/employees.csv";
        String outputFile="io-programming-practice/gcr-codebase/CSV-handling/employees_report.csv";
        try(
            BufferedReader br=new BufferedReader(new FileReader(inputFile));
            FileWriter writer=new FileWriter(outputFile)
        ){
            //write header
            writer.write("Employee ID,Name,Department,Salary\n");
            String line;
            while ((line =br.readLine()) != null){
                String[] data=line.split(",");
                writer.write(data[0]+","+data[1]+","+data[2]+","+data[3]+"\n");
            }
            System.out.println("CSV report generated successfully from CSV file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
