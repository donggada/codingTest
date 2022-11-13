package 프로그래머스;

import java.util.Arrays;

public class 숫자카드나누기 {
    public static void main(String[] args) {
        int[] arrayA ={10, 17};
        int[] arrayB ={5, 20};

//        int[] arrayA ={10, 20};
//        int[] arrayB ={5, 7};
//
//        int[] arrayA ={14, 35, 119};
//        int[] arrayB ={18, 30, 102};

        Solution solution = new Solution();
        System.out.println("solution1 = " + solution.solution(arrayA, arrayB));

    }

}
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int resultA = 0;
        int resultB = 0;
        for (int i = 0; i < arrayA.length -1 ; i++) {
            int gcdA = gcd(arrayA[i], arrayA[i + 1]);
            int gcdB = gcd(arrayB[i], arrayB[i + 1]);

            resultA = Math.max(resultA, gcdA);
            resultB = Math.max(resultB, gcdB);
        }

        answer = Math.max(resultA, resultB);
        return answer;
    }

    private static int gcd (int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b , a % b);
    }
}
