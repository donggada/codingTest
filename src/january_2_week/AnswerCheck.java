package january_2_week;

import january_2_week.basic.Solution;
import java.util.Arrays;

public class AnswerCheck {
    public static void main(String[] args) {
        String today1 = "2022.05.19";
        String[] terms1 = {"A 6", "B 12", "C 3"};
        String[] privacies1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        Solution solution1 = new Solution();

        System.out.println("개인정보 수집 유효기간 case1 = " + Arrays.toString(solution1.solution(today1, terms1, privacies1)));
        System.out.println("개인정보 수집 유효기간 case2 = " + Arrays.toString(solution1.solution(today2, terms2, privacies2)));
    }
}
