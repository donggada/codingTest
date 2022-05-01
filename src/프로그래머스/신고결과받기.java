package 프로그래머스;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] id_list = {"con", "ryan"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
//        int k = 3;

        System.out.println(solution.solution(id_list, report, k));
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> idReportMap = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> returnMap = new HashMap<>();

        for (String id : id_list) {
            HashSet<String> hashSet = new HashSet<>();
            idReportMap.put(id, hashSet);
            returnMap.put(id,0);
        }

        for (String reportElement : report) {
            String[] reportList = reportElement.split(" ");
            String reporter = reportList[1];
            String reportedID = reportList[0];


            HashSet<String> list = idReportMap.get(reporter);
            list.add(reportedID);

            idReportMap.put(reporter, list);
        }

        for (String id : id_list) {
            HashSet<String> list = idReportMap.get(id);

            if (list.size() >= k) {
                for (String sendEmailId : list) {
                    Integer count = returnMap.get(sendEmailId);
                    count++;
                    returnMap.put(sendEmailId, count);
                }
            }
        }

        for (int i = 0; i <id_list.length ; i++) {
            answer[i] = returnMap.get(id_list[i]);
        }

        return answer;
    }
}