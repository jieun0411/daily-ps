package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class hate_the_same_number {
    public static void main(String[] args){
        int[] array={4,4,4,3,3};
        System.out.println(Arrays.toString(solution(array)));
    }
    public static int[] solution(int[] array) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for(int i = 0; i < array.length-1; i++) {
            if(array[i] != array[i+1])
                arraylist.add(array[i]);
        }
        arraylist.add(array[array.length-1]);

        int[] answer = new int[arraylist.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arraylist.get(i);
        }
        return answer;
    }
}
