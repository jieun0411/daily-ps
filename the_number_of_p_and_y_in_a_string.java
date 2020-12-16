package programmers;

public class the_number_of_p_and_y_in_a_string {
    public static void main(String[] args){
        System.out.println(solution("ppYy"));
    }
    static boolean solution(String s) {
        boolean answer = true;
        int pcount=0,ycount=0;
        char[] temp = s.toCharArray();

        for(int i =0; i<temp.length; i++) {
            if(temp[i]=='p'||temp[i]=='P') {
                pcount++;
            }else if(temp[i]=='y'||temp[i]=='Y') {
                ycount++;
            }
        }
        if(pcount==ycount) {
            return true;
        }else {
            return false;
        }
    }
}
