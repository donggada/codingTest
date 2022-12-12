package december_3_week.basic;

import java.util.Arrays;

public class Solution {

    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (n > 0) {
            stringBuilder.append(n%k);
            n /= k;
        }
        String[] nums = stringBuilder.reverse().toString().split("0");

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
        int num = Integer.parseInt(s);

        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
