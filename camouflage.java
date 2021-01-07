package programmers;

import java.util.HashMap;

public class camouflage {
    public static void main(String[] args){
        String[][] clothes={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) //종류별 경우의 수 구하기
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);

        for (int i : hm.values())
            answer *= i; //종류별 경우의 수 곱하기

        return answer-1; //옷을 하나도 입지 않은 상태 빼주기
    }
}