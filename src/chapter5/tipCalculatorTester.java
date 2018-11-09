package chapter5;

import java.util.Scanner;

public class tipCalculatorTester {
    public static void main(String[] args) {
        tipCalculator tipCalculator = new tipCalculator();
        double postTip = 0;
        int tipPercent = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the cost of your meal: ");
        double preTip = in.nextDouble();
        System.out.println("Please enter the level of satisfaction of your meal\n" +
                "1 for totally satisfied\n" +
                "2 for satisfied\n" +
                "3 for dissatisfied\n");
        int satisfaction = in.nextInt();

        switch(satisfaction) {
            case 1:
                postTip = tipCalculator.totallySatisfied(preTip);
                tipPercent = 20;
                break;
            case 2:
                postTip = tipCalculator.satisfied(preTip);
                tipPercent = 15;
                break;
            case 3:
                postTip = tipCalculator.dissatisfied(preTip);
                tipPercent = 10;
                break;
        }
        System.out.printf("The total cost after a %d percent tip is %.2f", tipPercent, postTip);
    }
}
