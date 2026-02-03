import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
class Member{
    String name;
    LocalDate expiryDate;
    Member(String name, LocalDate expiryDate) {
        this.name=name;
        this.expiryDate= expiryDate;
    }
    public LocalDate getExpiryDate(){
        return expiryDate;
    }
}
public class ExpiringMemberships{
    public static void main(String[] args){
        List<Member> members =Arrays.asList(
            new Member("Aman", LocalDate.now().plusDays(10)),
            new Member("Sanjh", LocalDate.now().plusDays(40)),
            new Member("Pragati", LocalDate.now().plusDays(25))
        );
        LocalDate today=LocalDate.now();
        LocalDate next30Days=today.plusDays(30);
        members.stream()
            .filter(m-> m.getExpiryDate().isAfter(today)&& m.getExpiryDate().isBefore(next30Days))
            .forEach(m->System.out.println(m.name+" membership expiring soon"));
    }
}
