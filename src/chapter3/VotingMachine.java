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
        for(String e: votes) {
            if(e.equals("R")) {
                repubTally ++;
            } else if(e.equals("D")) {
                demTally ++;
            }
        }
    }

    ArrayList<String> votes = new ArrayList<>();
    public void voteDemocrat() {
        votes.add("D");
    }

    public void voteRepublican() {
        votes.add("R");
    }

    public void clearMachine() {
        votes.clear();
    }


}
