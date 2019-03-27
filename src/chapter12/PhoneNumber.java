package chapter12;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {
    private HashMap<String, String[]> numToStringMap = new HashMap<>();

    public PhoneNumber() {
        numToStringMap.put("0", new String[]{"_"});
        numToStringMap.put("1", new String[]{"_"});
        numToStringMap.put("2", new String[]{"A","B","C"});
        numToStringMap.put("3", new String[]{"D","E","F"});
        numToStringMap.put("4", new String[]{"G","H","I"});
        numToStringMap.put("5", new String[]{"J","K","L"});
        numToStringMap.put("6", new String[]{"M","N","O"});
        numToStringMap.put("7", new String[]{"P","Q","R", "S"});
        numToStringMap.put("8", new String[]{"T","U", "V"});
        numToStringMap.put("9", new String[]{"W","X","Y","Z"});
    }
    public ArrayList<String> getAllPossibleStrings(String x) {

        String[] letters = numToStringMap.get(x.substring(0, 1));
        if(x.length() == 1) {
            ArrayList<String> returnStringArray = new ArrayList<>();
            String[] returnLetters = numToStringMap.get(x);
            for(String s: returnLetters) {
                returnStringArray.add(s);
            }
            return returnStringArray;
        } else {
            ArrayList<String> returnStringArray = new ArrayList<>();
            for (int i = 0; i < letters.length; i++) {
                ArrayList<String> possibilities = getAllPossibleStrings(x.substring(1));
                for(int p = 0; p < possibilities.size(); p++) {
                    returnStringArray.add(letters[i] + possibilities.get(p));
                }
            }
            return returnStringArray;
        }
    }
}
