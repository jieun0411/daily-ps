package programmers;

public class make_large_number {
    public static void main(String[] args){
        System.out.println(solution("1231234",3));
    }
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder(number);
        int count=0;

        while(count<k){
            for (int i = 0; i < answer.length() - 1; i++) {
                if (answer.charAt(i) < answer.charAt(i + 1)) {
                    answer.deleteCharAt(i);
                    count++;
                    break;
                }
                if (i == answer.length() - 2) {
                    answer.deleteCharAt(i + 1);
                    count++;
                    break;
                }
            }
        }
        return answer.toString();
    }
}
