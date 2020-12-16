package programmers;

import java.util.Arrays;

public class create_array_inverting_natural_number {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(1234)));
    }
    public static int[] solution(long n) {
        String str = ""+n;
        int[] answer = new int[str.length()];
        for(int i=str.length()-1;i>=0;i--)
            answer[i] = str.charAt(str.length()- i - 1) - '0';
        return answer;
    }
}
