package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class player_not_finished {
    public static void main(String[] args){
        String[] participant={"a","b","c","d"};
        String[] completion={"a","d","c"};
        System.out.println(solution(participant,completion));
    }

    public static String solution(String[] participant, String[] completion){
        List<String> listP = new ArrayList<>(Arrays.asList(participant));
        List<String> listC = new ArrayList<>(Arrays.asList(completion));

        for(int i=0; i< completion.length;i++) {
            listP.remove(listC.get(i));
        }
        return listP.get(0);
    }
}
