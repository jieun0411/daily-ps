package programmers;

import java.util.Stack;

public class to_remove_in_pairs {
    public static void main(String[] args){
        System.out.println(solution("baabaa"));
    }
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(stack.isEmpty()) { //stack이 비어있으면 넣음
                stack.push(s.charAt(i));
            }else if(!stack.isEmpty()&&stack.peek()==s.charAt(i)){
                //비어있지 않고, top값이 지금 넣을 값과 같은 경우
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            answer=1;
        }
        System.out.println(answer);
        return answer;
    }
}
