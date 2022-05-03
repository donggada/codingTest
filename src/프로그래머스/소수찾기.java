package 프로그래머스;

import java.util.HashSet;

public class 소수찾기 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String number = "17";

        System.out.println(solution3.solution(number));
    }
}
class Solution3 {
    public int solution(String numbers) {
        int answer = 0;

        HashSet<Integer> set = new HashSet<>();

        permutation("", numbers, set); //순열

        while (set.iterator().hasNext()){
            int start=0;
            int a=set.iterator().next();
            for (int i = 1; i <=a ; i++) {
                if(a%i==0){
                    start++;
                }
            }
            if(start==2){
                answer++;
            }
            set.remove(a);
        }
        return answer;


    }
    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) {
            set.add(Integer.valueOf(prefix)); //스트링을 Interger로 변환
        }

        for (int i = 0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
        }

    }

}
