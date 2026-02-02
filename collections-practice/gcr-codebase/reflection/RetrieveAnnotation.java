import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}
@Author(name="Sarthak")
public class RetrieveAnnotation{
    public static void main(String[] args){
        Class<RetrieveAnnotation> cls = RetrieveAnnotation.class;
        Author author = cls.getAnnotation(Author.class);
        System.out.println("Author Name: " +author.name());
    }
}
