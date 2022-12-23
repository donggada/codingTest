package december_5_week.basic;

import java.util.LinkedList;

public class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long q1Sum = 0;
        long q2Sum = 0;
        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < queue1.length ; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            q1Sum += queue1[i];
            q2Sum += queue2[i];
        }


        while (q1Sum != q2Sum) {
            answer++;
            if (q1Sum > q2Sum) {
                Integer q1Pop = q1.pop();
                q1Sum -= q1Pop;
                q2Sum += q1Pop;
                q2.add(q1Pop);
            } else {
                Integer q2Pop = q2.pop();
                q1Sum += q2Pop;
                q2Sum -= q2Pop;
                q1.add(q2Pop);
            }

            if (answer > 4 * queue1.length) {
                return -1;
            }
        }
        return answer;
    }
}

