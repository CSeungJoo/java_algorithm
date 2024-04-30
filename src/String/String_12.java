package String;

import java.util.Scanner;

public class String_12 {

//    public static String solution(String str, int n) {
//        String answer = "";
//        String[] strArr = str.split("(?<=\\G.{7})", n);
//
//        for (String s : strArr) {
//            s = s.replace("#", "1").replace("*", "0");
//
//            int intS = Integer.parseInt(s, 2);
//            answer += (char)intS;
//        }
//
//        return answer;
//    }

    public static String solution(String str, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(str, n));
    }
}
