package library;
public class StaffMember extends Member{
    public StaffMember(int userId, String name) {
        super(userId, name);
    }
    @Override
    public double calculateFine(int lateDays) {
        return lateDays * 2; // ₹2 per day
    }
}
