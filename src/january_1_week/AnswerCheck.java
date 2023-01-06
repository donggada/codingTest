package january_1_week;

import january_1_week.advenced.Solution;

public class AnswerCheck {
    public static void main(String[] args) {
        int[][] board1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[] aloc1 = {1, 0};
        int[] bloc1 = {1, 2};

        int[][] board2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[] aloc2 = {1, 0};
        int[] bloc2 = {1, 2};

        int[][] board3 = {{1, 1, 1, 1, 1}};
        int[] aloc3 = {0, 0};
        int[] bloc3 = {0, 4};

        int[][] board4 = {{1}};
        int[] aloc4 = {0, 0};
        int[] bloc4 = {0, 2};

        Solution solution = new Solution();
        System.out.println("사라지는 발판 case 1 = " + solution.solution(board1, aloc1, bloc1));
        System.out.println("사라지는 발판 case 2 = " + solution.solution(board2, aloc2, bloc2));
        System.out.println("사라지는 발판 case 3 = " + solution.solution(board3, aloc3, bloc3));
        System.out.println("사라지는 발판 case 4 = " + solution.solution(board4, aloc4, bloc4));
    }
}
