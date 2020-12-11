package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class dividing_array {
    public static void main(String[] args){
        int[] arr={1,3,4,5,6};
        int division=3;
        System.out.println(Arrays.toString(solution(arr, division)));
    }
    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arraylist= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
            if (arr[i] % divisor == 0) arraylist.add(arr[i]);

        if (arraylist.size()==0) arraylist.add(-1);

        int [] answer = new int[arraylist.size()];
        for(int i=0; i<arraylist.size(); i++)
            answer[i] = arraylist.get(i);
        Arrays.sort(answer);
        return answer;
    }
}
