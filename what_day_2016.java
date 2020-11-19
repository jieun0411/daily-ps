package programmers;

public class what_day_2016 {
    public static void main(String[] args){
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        int[] month= {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
            for(int i = 0; i<a-1; i++){
                sum+=month[i];
            }
            sum+=b;
            answer=day[sum%7];
            return answer;
        }
}
