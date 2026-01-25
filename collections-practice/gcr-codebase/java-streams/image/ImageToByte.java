import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageToByte{
    public static void main(String[] args) {
        String sourceImage ="collections-practice/gcr-codebase/java-streams/input.jpg";
        String destinationImage= "collections-practice/gcr-codebase/java-streams/output.jpg";
        try (
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos= new ByteArrayOutputStream()
        ) {
            //read image into ByteArrayOutputStream
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1){
                baos.write(buffer, 0, bytesRead);
            }
            // Convert to byte array
            byte[] imageBytes = baos.toByteArray();
            // Write byte array back to image using ByteArrayInputStream
            try (
                ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                FileOutputStream fos = new FileOutputStream(destinationImage)
            ) {
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("Image converted to byte array and written successfully");

        } catch (IOException e) {
            System.out.println("Error during image byte conversion");
            e.printStackTrace();
        }
    }
}
