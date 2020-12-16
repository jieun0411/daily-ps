package programmers;

import java.util.Arrays;

public class remove_the_smallest_number {
    public static void main(String[] args){
    int[] arr={7,2,4,5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        if(arr.length<=1) answer[0]=-1;
        int min = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[min])
                min=i;
        }

        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (i == min) continue;
            answer[count++]=arr[i];
        }
        return answer;
    }
}
