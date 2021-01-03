package programmers;

public class list_of_phone_numbers {
    public static void main(String[] args){
        String[] phone_book={"123","456","789"};
        System.out.println(solution(phone_book));
    }
    public static boolean solution(String[] phone_book) {
        for(int i = 0; i < phone_book.length-1; i++){
            for(int j = i+1; j < phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])) return false;
                if(phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        return true;
    }
}
