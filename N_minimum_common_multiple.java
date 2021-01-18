package programmers;

public class N_minimum_common_multiple {
    public static void main(String[] args){
        int[] arr={2,6,8,14};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int lcm = arr[0];               //최소공배수를 구하기 위해 첫번째 요소 반환
        for(int i=1; i<arr.length; i++) //배열의 2번째 요소부터 최소공배수와 비교하여 최소공배수 구하기
            lcm = getLcm(lcm, arr[i]);
        return lcm;
    }

    public static int getGcd(int a, int b) {   //최대공약수
        int tmp;
        while(b != 0) {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static int getLcm(int a, int b) {   //최소공배수
        if(a<=0 || b<=0) return -1;
        return a * b / getGcd(a, b);
    }
}
