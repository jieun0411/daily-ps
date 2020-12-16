package programmers;

public class create_strange_string {
    public static void main(String[] args){
        System.out.println(solution(" asdF"));
    }
    public static String solution(String s) {
       String answer="";
       char ch;
       int count=0;

       for(int i=0;i<s.length();i++){
           ch=s.charAt(i);
           if (ch == ' ') {
               answer+=ch;
               count=0;
           }
           else{
               if(count%2==0) {
                   answer += String.valueOf(ch).toUpperCase();
                   count++;
               }
               else {
                   answer += String.valueOf(ch).toLowerCase();
                   count++;
               }
           }
       }
       return answer;
    }
}