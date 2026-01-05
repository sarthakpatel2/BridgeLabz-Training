public class InvoiceGenerator{
    //method to parse invoice string
    public static String[] parseInvoice(String input){
        return input.split(",");
    }
    // method to calculate total amount
    public static int getTotalAmount(String[] tasks){
        int total=0;
        for (String task:tasks){
            // split task and amount
            String[] part=task.split("-");
            //extract amount
            String amountPart=part[1].replace("INR","").trim();
            int amount=Integer.parseInt(amountPart);
            total+=amount;
        }
        return total;
    }
    //main method for testing
    public static void main(String[] args){
        String input="Logo Design - 3000 INR, Web Page - 4500 INR";
        String[] tasks=parseInvoice(input);
        System.out.println("Invoice Details:");
        for (String task:tasks){
            System.out.println(task.trim());
        }
        int totalAmount=getTotalAmount(tasks);
        System.out.println("Total Invoice Amount: "+totalAmount+" INR");
    }
}
