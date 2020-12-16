package programmers;

public class determining_if_integer_is_square_root {
    public static void main(String[] args){
        System.out.println(solution(9));
    }
    public static long solution(long n) {
        long answer = 0;
        long num = (long) Math.sqrt(n);
        if(num*num==n) return answer=(num+1)*(num+1);
        else return answer=-1;
    }
}
