package decemer_1_week.advenced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split(" ");

        int length = Integer.parseInt(array[0]);
        int removeCount = Integer.parseInt(array[1]);
        int size = length - removeCount;

        String num = br.readLine();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.parseInt(String.valueOf(num.charAt(0))));

        for (int i = 1; i < length ; i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            while (!stack.isEmpty() && removeCount > 0 && stack.peek() < number) {
                stack.pop();
                removeCount--;
            }
            stack.push(number);
        }

        for(int i = 0; i < size; i++) {
            result.append(stack.get(i));
        }

        System.out.println(result);
    }

}
