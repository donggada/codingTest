package december_3_week.basic;

import java.util.Arrays;

public class Solution {

    public int solution(int n, int k) {
        int answer = 0;
        String string = Integer.toString(n, k);
        String[] nums = string.split("0");


        for (String num : nums) {
            if (num.equals("")) {
                continue;
            }
            if (check(num)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean check(String s) {
        long num = Long.parseLong(s);

        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
