package chapter3;

import java.util.Scanner;

public class VotingMachineTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VotingMachine personVoting = new VotingMachine();
        System.out.println("Please type D for a Democrat vote, R for a Republican vote, C to clear the machine, or T to tally votes.");
        while(in.hasNextLine()) {
            String vote = in.nextLine();
            if(vote.equalsIgnoreCase("D")) {
                personVoting.voteDemocrat();
            } else if(vote.equalsIgnoreCase("R")) {
                personVoting.voteRepublican();
            } else if(vote.equalsIgnoreCase("C")) {
                personVoting.clearMachine();
            } else if(vote.equalsIgnoreCase("T")) {
                personVoting.getVotes();
                break;
            }
            else {
                System.out.println("Sorry, input not recognized. Please try again.");
            }
            System.out.println("Please type D for a Democrat vote, R for a Republican vote, C to clear the machine, or T to tally votes.");

        }
        System.out.printf("The votes are in! There are %d Democrats and %d Republicans!", personVoting.getDemTally(), personVoting.getRepubTally());
    }
}
