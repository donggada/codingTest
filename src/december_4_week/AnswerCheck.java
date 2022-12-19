package december_4_week;

import december_4_week.basic.Solution;

import java.util.Arrays;

public class AnswerCheck {
    public static void main(String[] args) {
        String[] survey1 = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices1 = {5, 3, 2, 7, 5};

        String[] survey2 = {"TR", "RT", "TR"};
        int[] choices2 = {7, 1, 3};

        Solution solution1 = new Solution();
        System.out.println("성격 유형 검사하기 case 1 = " + solution1.solution(survey1, choices1));
        System.out.println("성격 유형 검사하기 case 2 = " + solution1.solution(survey2, choices2));


        int[][] board1 ={{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
        int[][] skills1 ={{1,0,0,3,4,4},{1,2,0,2,3,2},{2,1,0,3,1,2},{1,0,1,3,3,1}};

        int[][] board2 ={{1,2,3},{4,5,6},{7,8,9}};
        int[][] skills2 ={{1,1,1,2,2,4},{1,0,0,1,1,2},{2,2,0,2,0,100}};

        december_4_week.advenced.Solution solution2 = new december_4_week.advenced.Solution();
        System.out.println("파과히지않은 건물 case 1 = " + solution2.solution(board1, skills1));
        System.out.println("파과히지않은 건물 case 2 = " + solution2.solution(board2, skills2));
    }
}
