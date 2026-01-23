package voting;
import java.util.*;
public class VotingSystem{
    private Map<String, Integer> voteCountMap =new HashMap<>();
    private Map<Integer, String> voteOrderMap=new LinkedHashMap<>();
    private int voteId =1;
    //cast vote
    public void castVote(String candidate) {
        // to maintain vote order
        voteOrderMap.put(voteId++, candidate);
        // count votes
        voteCountMap.put(candidate,voteCountMap.getOrDefault(candidate, 0)+1);
    }
    //display vote count
    public void displayVoteCount(){
        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : voteCountMap.entrySet()) {
            System.out.println(entry.getKey() +" - "+entry.getValue());
        }
    }
    // display votes in sorted order 
    public void displaySortedResults(){
        System.out.println("\nSorted Results (By Candidate Name):");
        TreeMap<String, Integer> sortedMap=new TreeMap<>(voteCountMap);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey()+" - " +entry.getValue());
        }
    }
    //display order of votes
    public void displayVoteOrder() {
        System.out.println("\nOrder of Votes Cast:");
        for (Map.Entry<Integer, String> entry : voteOrderMap.entrySet()){
            System.out.println("Vote " +entry.getKey()+ " - "+entry.getValue());
        }
    }
}
