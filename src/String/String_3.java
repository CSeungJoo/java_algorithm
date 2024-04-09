package String;

import java.util.Scanner;

public class String_3 {
//    // 방법 1
//    public static String solution(String str) {
//        String max = "";
//        // str을 공백마다 나누어 나눠진 개수만큼 반복
//        for (String splitStr : str.split(" ")) {
//            // 현재 나눠진 문자열과 기존 최대 문자열 대소비교
//            if (splitStr.length() > max.length())
//                // 더 크다면 max 교체
//                max = splitStr;
//        }
//        // 가장 큰 길이를 가진 문자열 return
//        return max;
//    }
    public static String solution(String str) {
        String answer = "";
        int pos;
        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > answer.length()) {
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > answer.length()) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 스트링 입력
        String inputStr = sc.nextLine();

        System.out.println(solution(inputStr));
    }
}
