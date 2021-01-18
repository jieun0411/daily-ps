package programmers;

public class Maximum_and_Minimum_values {
    public static void main(String[] args){
        System.out.println(solution("1 2 3 4"));
    }
    public static String solution(String s) {
        String[] str=s.split(" ");
        int min, max, n;
        min=max=Integer.parseInt(str[0]);
        for(int i=1;i<str.length;i++){
            n=Integer.parseInt(str[i]);
            if(min>n) min=n;
            if(max<n) max=n;
        }
        return min+" "+max;
    }
}
