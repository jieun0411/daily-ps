package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class truck_passing_through_bridge {
    public static void main(String[] args){
        int[] truck_weigths={7,4,5,6};
        System.out.println(solution(2,10,truck_weigths));
    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int answer = 0;
        int bridge_weight = 0;
        for(int ingTruck : truck_weights)
        {
            while(true){
                if(bridge.isEmpty()){
                    bridge.offer(ingTruck);
                    bridge_weight+=ingTruck;
                    answer++;
                    break;
                }else if(bridge.size() == bridge_length){
                    bridge_weight-=bridge.poll();
                }else if(bridge_weight + ingTruck <= weight){
                    bridge.offer(ingTruck);
                    bridge_weight+=ingTruck;
                    answer++;
                    break;
                }else{
                    bridge.offer(0);
                    answer++;
                }
            }
        }
        return answer + bridge_length;
    }
}
