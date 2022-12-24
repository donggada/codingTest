package december_5_week;

import december_5_week.basic.Solution;


public class AnswerCheck {
    public static void main(String[] args) {
        int[] queue1_1 = {3, 2, 7, 2};
        int[] queue1_2 = {4, 6, 5, 1};

        int[] queue2_1 = {1, 2, 1, 2};
        int[] queue2_2 = {1, 10, 1, 2};

        int[] queue3_1 = {1, 1};
        int[] queue3_2 = {1, 5};

        Solution solution1 = new Solution();
        System.out.println("두 큐 합 같게 만들기 case 1 = " + solution1.solution(queue1_1, queue1_2));
        System.out.println("두 큐 합 같게 만들기 case 2 = " + solution1.solution(queue2_1, queue2_2));
        System.out.println("두 큐 합 같게 만들기 case 3 = " + solution1.solution(queue3_1, queue3_2));

        december_5_week.advenced.Solution solution2 = new december_5_week.advenced.Solution();

        int[] info1 = {0 ,0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1};
        int[][] edges1 = {{0,1}, {1,2}, {1,4}, {0,8}, {8,7}, {9,10}, {9,11}, {4,3}, {6,5}, {4,6}, {8,9}};

        int[] info2 = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
        int[][] edges2 = {{0,1}, {0,2}, {1,3}, {1,4}, {2,5}, {2,6}, {3,7}, {4,8}, {6,9}, {9,10}};

        System.out.println("양과 늑대 case 1 = " + solution2.solution(info1, edges1));
        System.out.println("양과 늑대 case 2 = " + solution2.solution(info2, edges2));




    }
}
