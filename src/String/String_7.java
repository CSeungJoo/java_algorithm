package String;

import java.util.Scanner;

public class String_7 {
//    public static String solution(String str) {
//        str = str.toLowerCase();
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - i - 1)) return "NO";
//        }
//        return "YES";
//    }

    public static String solution(String str) {
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
