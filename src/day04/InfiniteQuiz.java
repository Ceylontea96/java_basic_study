package day04;

import java.util.Scanner;

public class InfiniteQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correct = 0;
        int incorrect = 0;
        int count = 1;
        int max = 0;

        //인트로
        System.out.println("~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 입력하세요~]");

        System.out.println("# 엔터를 누르면 시작합니다.");
        System.out.println("==============================");
        System.out.print(">");
        sc.nextLine();

        //난이도 설정
        System.out.println("난이도를 입력하세요. [상, 중, 하]");
        System.out.print(">>");
        String level = sc.next();

        String levelApply = "high";
        switch (level) {
            case "상":
                System.out.println("난이도가 [" + level + "](으)로 설정되었습니다.");
                max = 1000;
                break;
            case "중":
                System.out.println("[난이도가 [" + level + "](으)로 설정되었습니다.]");
                levelApply = "middle";
                max = 100;
                break;
            case "하":
                System.out.println("[난이도가 [" + level + "](으)로 설정되었습니다.]");
                levelApply = "low";
                max = 20;
                break;
            default:
                System.out.println("상, 중, 하 중에서 입력하지 않았기 때문에 난이도 [상]으로 시작합니다.");
                max = 1000;
                break;
        }
        while (true) {

            //변수에 난이도 적용
            int ran1 = (int) (Math.random() * max) + 1;
            int ran2 = (int) (Math.random() * max) + 1;

            //정답 초기값
            int answer = 0;

            //랜덤 연산자
            int ranOper = (int) (Math.random() * 3) + 1;
            String oper = "+";
            switch (ranOper) {
                case 1:
                    answer = ran1 + ran2;
                    break;
                case 2:
                    oper = "-";

                    //만약 두 숫자가 같다면 2번째 숫자에서 1을 빼주겠다.
                    if (ran1 == ran2) {
                        ran2--;
                    }
                    //뒷 숫자가 앞 숫자보다 크다면 두 값을 교체
                    if (ran1 < ran2) {
                        int temp = ran1;
                        ran1 = ran2;
                        ran2 = temp;
                    }
                    break;
                case 3:
                    oper = "*";
                    answer = ran1 * ran2;
                    break;
            }


            //연산자가 -일때 ran1과 ran2를 비교하여 큰 수를 앞으로하여 출력함
//            System.out.printf("$d %d %s %d = ?\n", count, ran1, oper, ran2)

            System.out.println(count + ") " + ran1 + " " + oper + " " + ran2 + " = ?");
            System.out.print("> ");

            //사용자 입력값
            int reply = sc.nextInt();

            //정답 검증
            if (reply == 0) {
                System.out.println("입력 종료!");
            } else if (reply == answer) {
                System.out.println("정답입니다!!");
                correct++;
                count++;
                continue;
            } else if (reply != answer) {
                System.out.println("틀렸는데요??");
                incorrect++;
                count++;
                continue;
            }

            //종료시 결과 출력
            System.out.println("=============================");
            System.out.println("정답횟수: " + correct + "회");
            System.out.println("오답횟수: " + incorrect + "회");
            break;
        }
    }
}
