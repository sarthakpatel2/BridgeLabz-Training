interface DataExporter{
    void export();
    //newly added feature
    default void exportToJSON() {
        System.out.println("Exporting data to JSON");
    }
}
class CSVExporter implements DataExporter{
    public void export(){
        System.out.println("Exporting data to CSV");
    }
}
class PDFExporter implements DataExporter{
    public void export() {
        System.out.println("Exporting data to PDF");
    }
}
public class DataExport{
    public static void main(String[] args){
        DataExporter csv=new CSVExporter();
        DataExporter pdf=new PDFExporter();
        csv.export();
        csv.exportToJSON();
        pdf.export();
        pdf.exportToJSON();
    }
}
