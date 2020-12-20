package programmers;

public class greatest_common_divisor_and_least_common_multiple {
    public static void main(String[] ars){
        System.out.println(solution(3,12));
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int temp;
        if(m<n) {
            temp = n;
            n = m;
            m = temp;
        }
        if(m%n==0) {
            answer[0] = n;
            answer[1] = m;
        }
        else {
            for(int i=1; i<n; i++) {
                if(n%i==0 && m%i==0) {
                    answer[0] = i;
                    answer[1] = (n*m)/i;
                }
            }
        }
        return answer;
    }
}
