package programmers;

public class stock_price {
    public static void main(String[] args){
        int[] prices={1,2,3,2,3};
        System.out.println(solution(prices));
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length-1;i++) {
            int count = 0;
            for(int j=i+1;j<prices.length;j++){
            if (prices[i] <= prices[j])
                count++;
            else {
                count++;
                break;
            }
        }
            answer[i]=count;
        }
        answer[prices.length-1]=0;
        return answer;
    }
}