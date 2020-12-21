package programmers;

import java.util.Arrays;

public class n_numbers_spaced_by_x {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(2, 5)));
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;

        for(int i = 0; i < n; i++)
            answer[i] = temp * (i+1);
        return answer;
    }
}
