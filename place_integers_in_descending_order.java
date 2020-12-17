package programmers;

import java.util.Arrays;
import java.util.Collections;

public class place_integers_in_descending_order {
    public static void main(String[] args){
        System.out.println(solution(23947));
    }
    public static long solution(long n) {
        String str = ""+n;
        String temp="";
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--)
            temp+=ch[i];
        long answer = Long.parseLong(temp);
        return answer;
    }
}
