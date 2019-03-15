package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class BondInfo {
    String[][] allBonds;

    public BondInfo() throws FileNotFoundException {
        Scanner in = new Scanner(new File("bonds.csv"));
        allBonds = new String[15][3];
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 3; j++) {
                allBonds[i][j] = in.next();
            }
        }
    }

    public String readBondName(String bond) {
        String info = "";
        for(int i = 0; i < 15; i++) {
            if(bond.equals(allBonds[i][0])) {
                info = "Bond energy: " + allBonds[i][1] + " kJ/mol\nBond length: " + allBonds[i][2] + " nm";
            }
        }
        return info;
    }

    public
}
