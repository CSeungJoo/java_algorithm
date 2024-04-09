package String;

import java.util.Scanner;
public class String_2 {
//    방법 1
//    public static String solution(String str) {
//        String answer = "";
//        // Str을 Char배열로 변환후 반복
//        for (char c : str.toCharArray()) {
//            // 대소문자 검증식
//            if (Character.isLowerCase(c)) {
//                answer += Character.toUpperCase(c);
//            }else {
//                answer += Character.toLowerCase(c);
//            }
//        }
//        return answer;
//    }

    public static String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) answer += (char)(c - 32);
            else answer += (char)(c + 32);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 : String
        String inputStr = sc.next();

        System.out.println(solution(inputStr));
    }
}
