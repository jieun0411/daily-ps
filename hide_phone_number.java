package programmers;

public class hide_phone_number {
    public static void main(String[] args){
        System.out.println(solution("01033333333"));
    }
    public static String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length()-4)
                answer += "*";
            else
                answer += phone_number.charAt(i);
        }
        return answer;
    }
}
