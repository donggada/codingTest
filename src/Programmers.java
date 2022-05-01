import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.CancellationException;

public class Programmers {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};

        System.out.println(solution.solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                for (int k = j+1; k <nums.length ; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    private boolean isPrime (int num) {
        for (int i = 2; i <num ; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}
