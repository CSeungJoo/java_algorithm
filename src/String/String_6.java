package String;

import java.util.Scanner;

public class String_6 {
//    public static String solution(String str) {
//        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            answer += String.valueOf(str.charAt(i));
//            str = str.replaceAll(String.valueOf(str.charAt(i)), " ");
//        }
//
//        return answer.replaceAll(" ", "");
//    }
    public static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
