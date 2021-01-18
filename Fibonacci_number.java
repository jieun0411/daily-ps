package programmers;

public class Fibonacci_number {
    public static void main(String[] args){
        System.out.println(solution(3));
    }
    public static int solution(int n) {
        if(n==1 || n==2) return 1;
        int n1=1, n2=1, sum=0;
        for(int i=3;i<=n;i++){
            sum=n1+n2;
            sum%=1234567;
            n1=n2;
            n2=sum;
        }
        return sum;
    }
}
