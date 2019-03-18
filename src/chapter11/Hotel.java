package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hotel {
    String[][] hotelEvent;

    public Hotel() {
        Scanner in = null;
        try {
            in = new Scanner(new File("src/chapter11/hotel.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        in.useDelimiter(",");
        hotelEvent = new String[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(in.hasNext()) {
                    hotelEvent[i][j] = in.next();
                }
            }
        }
    }
}
