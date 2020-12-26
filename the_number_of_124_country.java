package programmers;

public class the_number_of_124_country {
    public static void main(String[] args){
        System.out.println(solution(10));
    }
    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";
        while (n > 0){
            int rem=n%3;
            if (rem == 0) n--;
            answer = num[rem] + answer;
            n /= 3;
        }
        return answer;
    }
}
