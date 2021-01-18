package programmers;

import java.util.Arrays;

public class Create_Minimum_Value {
    public static void main(String[] args){
        int[] A={1,4,2};
        int[] B={5,4,4};
        System.out.println(solution(A,B));
    }
    public static int solution(int []A, int []B){
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i=0; i<A.length; i++)
            sum += A[i] * B[A.length-i-1];

        return sum;
    }
}
