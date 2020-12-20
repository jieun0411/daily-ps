package programmers;

public class collatz_conjecture {
    public static void main(String[] args){
        System.out.println(solution(16));
    }
    public static int solution(int num) {
        int answer = 0;
        if(num==1) return answer;
        while(num!=1) {
            if(num%2==0)
                num /= 2;
            else
                num = 3*num + 1;
            answer++;

            if(answer==500) {
                answer=-1;
                break;
            }
        }
        return answer;
    }
}
