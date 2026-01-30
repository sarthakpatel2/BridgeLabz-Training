public class SSNValidator{
    public static void main(String[] args){
        String ssn1="123-45-6789";
        String ssn2="123456789";
        String ssnRegex ="^\\d{3}-\\d{2}-\\d{4}$";
        System.out.println(ssn1+" - "+(ssn1.matches(ssnRegex) ?"Valid" : "Invalid"));
        System.out.println(ssn2+" - "+(ssn2.matches(ssnRegex) ?"Valid" : "Invalid"));
    }
}
