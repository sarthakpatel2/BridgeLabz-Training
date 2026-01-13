package voting;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        OnlineElection election = new OnlineElection();
        // Register voters
        election.registerVoter(new Voter(1, "Sarthak"));
        election.registerVoter(new Voter(2,"Shivam"));
        // Add candidates
        election.addCandidate(new Candidate(101, "Sanjh"));
        election.addCandidate(new Candidate(102, "Ayushi"));

        try {
            // Cast votes
            election.castVote(1, 101);
            election.castVote(2,102);
            // Duplicate vote
            election.castVote(1, 102);
        } catch (DuplicateVoteException e){
            System.out.println("Error: " + e.getMessage());
        }
        // Declare result
        election.declareResults();
    }
}
