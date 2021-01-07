package programmers;

import java.util.Arrays;

public class rescue_boat {
    public static void main(String[] args){
        int[] people={70, 50, 80, 50};
        System.out.println(solution(people,100));
    }
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; min <= max; max--){
            if (people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }
}
