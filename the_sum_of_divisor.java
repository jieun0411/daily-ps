package programmers;

public class the_sum_of_divisor {
    public static void main(String[] args){
        System.out.println(solution(12));
    }
    public static int solution(int n) {
        int answer = 1;
        for(int i=2;i<=n;i++)
            if(n%i==0)
                answer+=i;
        return answer;
    }
}
