package chapter3;

import java.util.ArrayList;

public class VotingMachine {

    int repubTally;
    int demTally;

    public int getRepubTally() {
        return repubTally;
    }

    public int getDemTally() {
        return demTally;
    }


    public void getVotes() {
        //Investigate using lamdas with stream processing here
        
        for(String e: votes) {
            if(e.equals("R")) {
                repubTally ++;
            } else if(e.equals("D")) {
                demTally ++;
            }
        }
    }

    //I would suggest moving this up to the top of the class
    //also, use the interface when declaring the collection
    // List<String> votes = new ArrayList<>();
    
    ArrayList<String> votes = new ArrayList<>();
    public void voteDemocrat() {
        //you could just bump the counter and not use the colleciton
        votes.add("D");
    }

    public void voteRepublican() {
        votes.add("R");
    }

    public void clearMachine() {
        votes.clear();
    }


}
