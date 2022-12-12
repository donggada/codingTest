package december_3_week;

import december_3_week.basic.Solution;

import java.util.Arrays;

public class AnswerCheck {
    public static void main(String[] args) {
        int n1 = 437674;
        int k1 = 3;

        int n2 = 110011;
        int k2 = 10;

        Solution solution1 = new Solution();
        System.out.println("K 에서 소수 개수 구하기 case1 = " + solution1.solution(n1, k1));
        System.out.println("K 에서 소수 개수 구하기 case2 = " + solution1.solution(n2, k2));

        int n3 = 5;
        int[] info3 = {2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

        int n4 = 1;
        int[] info4 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int n5 = 9;
        int[] info5 = {0, 0, 1, 2, 0, 1, 1, 1, 1, 1, 1};

        int n6 = 10;
        int[] info6 = {0, 0, 0, 0, 0, 0, 0, 0, 3, 4, 3};

        december_3_week.advenced.Solution solution2 = new december_3_week.advenced.Solution();
        System.out.println("양궁대회 case 1 = " + Arrays.toString(solution2.solution(n3, info3)));
        System.out.println("양궁대회 case 2 = " + Arrays.toString(solution2.solution(n4, info4)));
        System.out.println("양궁대회 case 3 = " + Arrays.toString(solution2.solution(n5, info5)));
        System.out.println("양궁대회 case 4 = " + Arrays.toString(solution2.solution(n6, info6)));

    }
}
