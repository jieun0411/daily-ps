package programmers;

public class sum_between_two_integers {
    public static void main(String[] args){
        System.out.println(solution(2,4));
    }
    public static long solution(int a, int b) {
        long answer = 0;
        if(a==b) answer=a;
        else if(a>b){
            for(int i=b;i<=a;i++)
                answer+=i;
        }
        else{
            for(int i=a;i<=b;i++)
                answer+=i;
        }
        return answer;
    }
}
