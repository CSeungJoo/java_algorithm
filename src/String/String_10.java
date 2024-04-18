package String;

import java.util.Scanner;

public class String_10 {
    public static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int count = 100;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count = 0;
            answer[i] = count;
            count++;
        }

        count = 100;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c)
                count = 0;
            else
                count++;
            if (answer[i] > count)
                answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        for (int i : solution(str, t)) {
            System.out.print(i + " ");
        }
    }
}
