package december_1_week.basic;

import java.util.HashMap;
import java.util.HashSet;

//public class Solution {
//    public int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = new int[id_list.length];
//        HashMap<String, List<String>> data = new HashMap<String, List<String>>();
//        HashMap<String, Integer> reportList = new HashMap<String, Integer>();
//        List<String> stopIDList = new ArrayList<>();
//
//        for (String id : id_list) {
//            data.put(id, new ArrayList<>());
//            reportList.put(id, 0);
//        }
//
//        for (String infos : report) {
//            String[] info = infos.split(" ");
//
//            //신고자 ID
//            String reporterID = info[0];
//            //신고당한 ID
//            String reportedID = info[1];
//
//            List<String> list = data.get(reporterID);
//            int reportCount = reportList.get(reportedID);
//
//            if (reportCount >= k) {
//                stopIDList.add(reportedID);
//            }
//
//            if (!list.contains(reportedID)) {
//                list.add(reportedID);
//                if (reportCount + 1 >= k) {
//                    stopIDList.add(reportedID);
//                }
//                reportList.put(reportedID, reportCount + 1);
//            }
//
//
//        }
//
//        for (int i = 0; i <id_list.length ; i++) {
//            String id = id_list[i];
//            List<String> list = data.get(id);
//            for (String stopID : list) {
//                if (stopIDList.contains(stopID)) {
//                    answer[i]++;
//                }
//            }
//        }
//
//        return answer;
//    }
//}

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> data = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> returnMap = new HashMap<>();

        for (String id : id_list) {
            HashSet<String> hashSet = new HashSet<>();
            data.put(id, hashSet);
            returnMap.put(id, 0);
        }

        for (String infos : report) {
            String[] info = infos.split(" ");

            //신고자 ID
            String reporterID = info[0];
            //신고당한 ID
            String reportedID = info[1];

            HashSet<String> list = data.get(reportedID);
            list.add(reporterID);

        }

        for (String id : id_list) {
            HashSet<String> list = data.get(id);

            if (list.size() >= k) {
                for (String sendEmailID : list) {
                    returnMap.put(sendEmailID, returnMap.get(sendEmailID) + 1);
                }
            }
        }

        for (int i = 0; i <id_list.length ; i++) {
            answer[i] = returnMap.get(id_list[i]);
        }

        return answer;
    }
}