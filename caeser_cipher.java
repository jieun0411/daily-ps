package programmers;

public class caeser_cipher {
    public static void main(String[] args){
        System.out.println(solution("e B z",2));
    }
    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z')
                    ch -= 26;
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + n);
                if (ch > 'Z')
                    ch -= 26;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}