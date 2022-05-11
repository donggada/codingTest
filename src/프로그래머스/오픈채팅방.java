package 프로그래머스;

public class 오픈채팅방 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        System.out.println(solution4.solution(record));
    }
}

class Solution4 {
    public String[] solution(String[] record) {
        String[] answer = {};
        for (String str :record) {
            String[] strArray = str.split(" ");

            if (!strArray[0].equals("Change")) {

            } else {

            }
        }
        return answer;
    }
}
