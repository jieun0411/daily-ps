package programmers;

public class carpet {
    public static void main(String[] args){
        System.out.println(solution(10,2));
    }
    public static int[] solution(int brown, int yellow) {
        //brown = width * height - yellow
        //yellow = (width-2) * (height-2)
        int height = 3;
        int width = (brown + yellow) / height;

        while((width -2) * (height-2) != yellow)
            width  = (brown + yellow) / ++height;

        return new int[] {width , height};
    }
}
