package december_2_week.advenced;


import java.util.*;

public class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        HashMap<String, Integer> totalTimeMap = new HashMap<>();
        HashMap<String, Integer> inTimeMap = new HashMap<>();


        for (String record : records) {
            String[] info = record.split(" ");
            String time = info[0];
            String carNum = info[1];

            if (inTimeMap.containsKey(carNum)) {
                totalTimeMap.put(carNum, totalTimeMap.get(carNum) + changeMin(time) - inTimeMap.get(carNum));
                inTimeMap.remove(carNum);
            } else {
                inTimeMap.put(carNum, changeMin(time));

                if (!totalTimeMap.containsKey(carNum)) {
                    totalTimeMap.put(carNum, 0);
                }
            }

        }

        for (String carNum :inTimeMap.keySet()) {
            totalTimeMap.put(carNum, totalTimeMap.get(carNum) + changeMin("23:59") - inTimeMap.get(carNum));
        }

        ArrayList<String> list = new ArrayList<>(totalTimeMap.keySet());
        Collections.sort(list);

        answer = new int[list.size()];

        for (int i = 0; i <list.size() ; i++) {
            Integer time = totalTimeMap.get(list.get(i));
            if (time >= fees[0]) {
                answer[i] =  (int) (fees[1] + Math.ceil((double) (time - fees[0]) / fees[2]) * fees[3]);
            } else {
                answer[i] = fees[1];
            }
        }

        return answer;
    }
    private static int changeMin(String time){
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]) * 60;
        int min = Integer.parseInt(times[1]);
        return hour + min;
    }
}