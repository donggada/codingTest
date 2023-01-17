package january_2_week.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public Integer[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int todayReplace = exchangeDateToInt(today);
        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term :terms) {
            String[] array = term.split(" ");
            termsMap.put(array[0], Integer.parseInt(array[1]));
        }

        for (int i = 0; i < privacies.length ; i++) {
            String[] array = privacies[i].split(" ");
            String[] split = array[0].split("[.]");

            int exchangeDateToInt = exchangeDateToInt(array[0]);

            int month = Integer.parseInt(split[1]);
            int sumMonth = month + termsMap.get(array[1]);

            if (sumMonth / 13 == 0) {
                exchangeDateToInt += termsMap.get(array[1]) * 100;
            } else {
                exchangeDateToInt += (sumMonth/13) * 10000;
            }
//            System.out.println("todayReplace = " + todayReplace);
//            System.out.println("exchangeDateToInt = " + exchangeDateToInt);
            if (todayReplace > exchangeDateToInt -1) {
                resultList.add(i + 1);
            }
        }

        return resultList.toArray(new Integer[0]);
    }

    private int exchangeDateToInt (String date) {
        return Integer.parseInt(date.replace(".", ""));
    }
}
