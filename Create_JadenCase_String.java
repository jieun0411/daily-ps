package programmers;

public class Create_JadenCase_String {
    public static void main(String[] args){
        String s = "3people unFollowed me ASfsdf adfasdfA123 123123aASFFGGG 1 asdfasdf  ";
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder(); // 문자열을 더하기 때문에 StringBuilder 사용

        String firstStr = s.charAt(0) + "";
        answer.append(firstStr.toUpperCase()); // 첫 글자는 무조건 대문자

        for (int i = 1; i < s.length(); i++) {
            String now = s.charAt(i) + "";
            if (now.equals(' ')) { // 공백이면 그대로 넘어가기
                answer.append(" ");
            } else if (s.charAt(i - 1) == ' ') { // 전 문자열이 공백이면
                answer.append(now.toUpperCase()); // 대문자
            } else {
                answer.append(now.toLowerCase()); // 소문자
            }
        }

        return answer.toString();
    }
}
