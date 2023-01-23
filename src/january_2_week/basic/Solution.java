package january_2_week.basic;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public Integer[] solution(String today, String[] terms, String[] privacies) {
        LocalDate nowLocalDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        ArrayList<Integer> resultList = new ArrayList<>();
        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term :terms) {
            String[] array = term.split(" ");
            termsMap.put(array[0], Integer.parseInt(array[1]));
        }
        
        for (int i = 0; i < privacies.length ; i++) {
            String[] privacy = privacies[i].split(" ");
            LocalDate localDate = LocalDate.parse(privacy[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));

            if (!localDate.plusMonths(termsMap.get(privacy[1])).isAfter(nowLocalDate)) {
                resultList.add(i + 1);
            }
        }


        return resultList.toArray(new Integer[0]);
    }


}
