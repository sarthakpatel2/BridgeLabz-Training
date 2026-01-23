package voting;
public class Main{
    public static void main(String[] args){
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Sarthak");
        votingSystem.castVote("Sanjh");
        votingSystem.castVote("Aman");
        votingSystem.castVote("Shivendra");
        votingSystem.castVote("Madhav");
        votingSystem.castVote("Shivam");
        votingSystem.displayVoteOrder();
        votingSystem.displayVoteCount();
        votingSystem.displaySortedResults();
    }
}
