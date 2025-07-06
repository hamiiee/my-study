package level2;// https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class Practice12909 {
    public static void main(String[] args) {
        String s = "(())";

        boolean answer = false;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) == '(' ){
                cnt++;
            } else if ( s.charAt(i) == ')' ) {
                cnt--;
            }

            if( cnt < 0 ){
                break;
            }
        }

        if( cnt == 0 ) {
            answer = true;
        }

        System.out.println(answer);
    }
}
