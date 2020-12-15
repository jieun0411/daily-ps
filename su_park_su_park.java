package programmers;

public class su_park_su_park {
    public static void main(String[] args){
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        String answer = "";
        for(int i=0;i<(n/2);i++)
            answer+="수박";
        if(n%2==1)
            answer+="수";
        return answer;
        }

}
