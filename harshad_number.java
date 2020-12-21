package programmers;

public class harshad_number {
    public static void main(String[] args){
        System.out.println(solution(10));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int num = x;
        while(num != 0) {
            sum += num%10;
            num /= 10;
        }

        if(x % sum == 0)
            answer=true;
        else
            answer=false;
        return answer;
    }
}
