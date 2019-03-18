package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BondInfo {
    String[][] allBonds;

    public BondInfo() {
        Scanner in = null;
        try {
            in = new Scanner(new File("src/chapter11/bonds.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        in.useDelimiter(",");
        allBonds = new String[15][3];
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < 3; j++) {
                if(in.hasNext()) {
                    allBonds[i][j] = in.next();
                }
            }
        }
    }

    public String readBondName(String bond) {
        String info = "";
        for(int i = 0; i < 15; i++) {
            if(bond.equals(allBonds[i][0].trim())) {
                info = "Bond energy: " + allBonds[i][1].trim() + " kJ/mol  Bond length: " + allBonds[i][2].trim() + " nm";
            }
        }
        return info;
    }

    public String readBondEnergy(int bond) {
        String info = "";
        String bondValue = String.valueOf(bond);
        for(int i = 0; i < 15; i++) {
            if(bondValue.equals(allBonds[i][1].trim())) {
                info = "Bond name: " + allBonds[i][0].trim() + " kJ/mol    Bond length: " + allBonds[i][2].trim() + " nm";
            }
        }
        return info;
    }

    public String readBondLength(double lenString) {
        String info = "";
        String bondLength = String.valueOf(lenString);
        for(int i = 0; i < 15; i++) {
            if(bondLength.equals(allBonds[i][2].trim())) {
                info = "Bond name: " + allBonds[i][0].trim() + " kJ/mol    Bond energy: " + allBonds[i][1].trim();
            }
        }
        return info;
    }
}
