package 프로그래머스;

public class 큰수만들기 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String number = "1924";
        int k = 2;
        System.out.println(solution2.solution(number, k));
    }
}

class Solution2 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        char max;
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';
            for(int j = idx; j <= k + i; j++) {
                if(max < number.charAt(j)) {
                    max = number.charAt(j);  // 최댓값 찾기
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
