package decemer_1_week;

import decemer_1_week.basic.Solution;

import java.util.Arrays;

public class AnswerCheck {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] id_list, String[] report, int k
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

//        String[] id_list = {"con", "ryan"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
//        int k = 3;
        System.out.println("solution = " + Arrays.toString(solution.solution(id_list, report, k)));
    }
}
