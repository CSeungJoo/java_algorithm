package String;

import java.util.Scanner;

public class String_9 {

    public static int solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                answer += c;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(solution(str));
    }
}
