package String;

import java.util.Scanner;

public class findChar_1 {
    public static int solution(String str, char t) {
        int answer = 0;

        for(char x : str.toCharArray()) {
           if(x == t) answer += 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        char c = sc.next().toLowerCase().charAt(0);

        System.out.println(solution(str, c));
    }
}
