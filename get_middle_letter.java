package programmers;

public class get_middle_letter {
    public static void main(String[] args){
        System.out.println(solution("abcde"));
    }
        public static String solution(String s) {
            String answer = "";
            int len=s.length();
            if(len%2==0)
               answer= s.substring(len/2-1,len/2+1);
            else
                answer=s.substring(len/2,len/2+1);
            return answer;
        }
}