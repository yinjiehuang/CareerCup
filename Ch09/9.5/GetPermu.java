// Write a method to compute all permutations of a string
//

import java.util.*;

public class GetPermu {
        public static void main(String[] args) {
                System.out.println("CareerCup 9.5!!!");
                String s = "string";
                GetPermu gp = new GetPermu();
                ArrayList<String> result = gp.getPermu(s);
                for (String permu: result) {
                        System.out.println(permu);
                }
        }

        public ArrayList<String> getPermu(String s) {
                if (s == null) {
                        return null;
                }
                ArrayList<String> result = new ArrayList<String>();
                if (s.length() == 0) {
                        result.add("");
                        return result;
                }
                char first = s.charAt(0);
                String remain = s.substring(1);
                ArrayList<String> subresult = getPermu(remain);
                for (String permu: subresult) {
                        for (int i = 0; i <= permu.length(); i++) {
                                String temps = permu.substring(0,i) + first + permu.substring(i);
                                result.add(temps);
                        }
                }
                return result;
        }
}
