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

    }
}
