package voting;

import java.util.*;
public class OnlineElection extends ElectionService {
    private Map<Integer, Voter> voters=new HashMap<>();
    private Map<Integer, Candidate> candidates= new HashMap<>();
    private List<Vote> votes=new ArrayList<>();
    @Override
    void registerVoter(Voter voter) {
        voters.put(voter.voterId, voter);
        System.out.println("Voter registered: " + voter.name);
    }
    @Override
    void addCandidate(Candidate candidate) {
        candidates.put(candidate.candidateId, candidate);
        System.out.println("Candidate added: " + candidate.name);
    }
    @Override
    void castVote(int voterId, int candidateId)
            throws DuplicateVoteException {
        Voter voter = voters.get(voterId);
        Candidate candidate = candidates.get(candidateId);
        if (voter ==null || candidate== null) {
            System.out.println("Invalid voter or candidate");
            return;
        }
        if (voter.hasVoted){
            throw new DuplicateVoteException("Voter "+voter.name + " has already voted");
        }
        voter.hasVoted=true;
        candidate.votes++;
        votes.add(new Vote(voterId, candidateId));
        System.out.println("Vote cast successfully by "+voter.name);
    }
    @Override
    void declareResults() {
        System.out.println("\nElection Results:- ");
        for (Candidate c : candidates.values()) {
            System.out.println(c.name + ": "+c.votes +" votes");
        }
    }
}
