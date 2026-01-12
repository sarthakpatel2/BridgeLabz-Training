package library;

public class StudentMember extends Member {

    public StudentMember(int userId, String name) {
        super(userId, name);
    }

    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 2; // ₹2 per day
    }
}
