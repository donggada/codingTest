package december_4_week.basic;

import java.util.HashMap;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Character[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Character[] case1 = {'R', 'T'};
        Character[] case2 = {'C', 'F'};
        Character[] case3 = {'J', 'M'};
        Character[] case4 = {'A', 'N'};
        HashMap<Character, Integer> pointMap = new HashMap<>();

        for (Character c : type) {
            pointMap.put(c ,0);
        }

        for (int i = 0; i <choices.length ; i++) {
            int point = choices[i];
            boolean choice = choices[i] < 4;


            if (choice) {
                pointMap.put(survey[i].charAt(0), pointMap.get(survey[i].charAt(0)) + 4 - point);
            } else if (point != 4) {
                pointMap.put(survey[i].charAt(1), pointMap.get(survey[i].charAt(1)) + point - 4);
            }
        }

        answer  += print(pointMap, case1);
        answer  += print(pointMap, case2);
        answer  += print(pointMap, case3);
        answer  += print(pointMap, case4);

        return answer;
    }
    private String print (HashMap<Character, Integer> map,Character[] type) {
        Integer type1 = map.get(type[0]);
        Integer type2 = map.get(type[1]);

        if (type1 >= type2) {
            return type[0].toString();
        }
        return type[1].toString();
    }
}
