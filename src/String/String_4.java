package String;

import java.util.Scanner;

public class String_4 {

//    public static void solution(int N, Scanner sc) {
////      N번 반복
//        for (int i = 0; i < N; i++) {
////          입력받고 StringBuilder에 넣고 reverse() 하고 .toString으로 스트링 형식으로 저장
//            String str = new StringBuilder(sc.next()).reverse().toString();
////          저장된 값 출력
//            System.out.println(str);
//        }
//    }

    public static void solution(int N, Scanner sc) {
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            char[] c = str.toCharArray();
            int lt = 0, rt = str.length() - 1;
            while(lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            System.out.println(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        solution(N, sc);
    }
}
