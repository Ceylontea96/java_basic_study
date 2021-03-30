package day06;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RussianRoulette {

    private static Scanner sc = new Scanner(System.in);

    public static int safeNextInt() {
        while (true) {
            int num = 0;
            try {
                num = sc.nextInt();
                return num;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("정수로만 입력하세요.");
            }
        }
    }

    public static void main(String[] args) {


        //게임 참가인원 제한
        int minPlayer = 2;
        int maxPlayer = 4;

        //실린더 칸 설정
        int cylinderMax = 6;

        while (true) {
            System.out.print("게임 인원 (" + minPlayer + " ~ " + maxPlayer + "명) ==> ");
            int number = safeNextInt();

            if (number < minPlayer | number > maxPlayer) {
                System.out.println("게임 인원은 " + minPlayer + " ~ " + maxPlayer + "명이어야 합니다.");
                continue;//플레이어 숫자가 정해진 범위를 넘었을 시 반복문 재실행
            } else {
                String[] players = new String[number];
                System.out.println("플레이어 이름을 등록합니다.");
                for (int i = 0; i < number; i++) {
                    System.out.print((i + 1) + "번 플레이어 이름: ");
                    players[i] = sc.next();
                }
                System.out.println(Arrays.toString(players) + " 참가!\n");

                while (true) {
                    System.out.print("실탄 개수 (" + cylinderMax + "미만) ==> ");
                    int bullets = safeNextInt();

                    if (bullets < 1 | bullets > (cylinderMax - 1)) {
                        //총알의 개수는 1개보다 작을 수 없고, 실린더의 칸과 같거나 보다 많을 수 없다.
                        System.out.println("실탄 개수는 1개 ~ " + (cylinderMax - 1) + "개로 설정해주세요.");
                        continue;//총알 숫자가 정해진 범위를 넘었을 시 반복문 재실행
                    } else {
                        boolean[] cylinder = new boolean[cylinderMax];
                        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.\n");
                        for (int i = 0; i < bullets; i++) {
                            int ammunition = (int) (Math.random() * cylinderMax);
                            if (!cylinder[ammunition]) {
                                //cylinder의 랜덤 인덱스가 false이면 즉, 해당 칸이 비어있다면
                                cylinder[ammunition] = true;
                            } else {
                                //cylinder의 랜덤 인덱스가 true이면 즉, 해당 칸에 총알이 있다면
                                i--;
                            }
                        }//실탄 장전 for문 완료
                        //장전 제대로 되었는지 확인하는 출력문
                        //System.out.println(Arrays.toString(cylinder));

                        //처음 시작하는 사람 지정
                        int turn = (int) (Math.random() * number);//변수 ran은 인덱스에 적용되기 때문에 0부터 시작
                        System.out.println("총을 돌렸습니다. " + players[turn] + "부터 시작합니다.\n\n");
                        boolean rotation = true;//실린더를 회전할지 결정하는 변수
                        int bang = (int) (Math.random() * cylinderMax);
                        //변수 bang의 값은 cylinder 배열을 탐색하는 인덱스요소에 적용되기 때문에 배열의 최대값으로 범위를 결정한다.

                        while (true) {

                            if (turn == players.length) {
                                turn = 0;
                            }

                            System.out.print("[" + players[turn] + "의 턴!]");
                            if (rotation) {
                                System.out.println(" 실린더를 무작위로 돌립니다.");
                                bang = (int) (Math.random() * cylinderMax);
                            } else {
                                System.out.println(" 총을 그대로 넘겨받습니다.");
                                if (bang < cylinderMax - 1) {
                                    //변수 bang은 인덱스값에 적용되기 때문에 그 최대값이 배열 최대길이보다 1작아야한다.
                                    bang++;
                                } else {
                                    bang = 0;
                                }
                            }

                            System.out.println("# 엔터를 누르면 격발합니다.");
                            sc.nextLine(); // 위에서 발생한 nexInt의 \n을 처리하는 구문
                            sc.nextLine(); // 실제로 엔터를 입력받는 기능
                            //이 아래부터 맞았는지 판정

                            //처음이면 first로 돌리고 끝날때 선택, 선택 결과에 따라 +1할지 다시 돌릴지
                            if (!cylinder[bang]) {
                                System.out.println("휴..... 살았습니다.");
                                System.out.println("실린더를 회전시킨 후 다음사람에게 넘기시겠습니까?");
                                //회전 변수를 제어
                                System.out.println("1. [네]  2. [아니요] (1 또는 2를 입력해주세요.)");
                                System.out.print(">");
                                int choice = sc.nextInt();
                                switch (choice) {
                                    case 1:
                                        rotation = true;
                                        break;
                                    case 2:
                                        rotation = false;
                                }//회전 변수 제어
                                turn++;
                            } else {
                                System.out.println("빵!!! 사망...");
                                cylinder[bang] = false;
                                bullets--;

                                //사망한 멤버 배열에서 삭제
                                for (int i = turn; i < players.length - 1; i++) {
                                    players[i] = players[i + 1];
                                }

                                String[] temp = new String[players.length - 1];
                                for (int i = 0; i < temp.length; i++) {
                                    temp[i] = players[i];
                                }
                                players = temp;
                                temp = null;

                                //플레이어가 한명 남거나, 총알이 없어지면 반복문 종료
                                if (players.length == 1) {
                                    System.out.println("플레이어가 한 명 남았습니다. 게임을 종료합니다.");
                                    break;
                                } else if (bullets == 0) {
                                    System.out.println("총알이 모두 소진되었습니다. 게임을 종료합니다.");
                                    break;
                                } else {
                                    System.out.println("\n남은 인원으로 게임을 계속합니다.");
                                    System.out.println("남은 인원: " + Arrays.toString(players));
                                }
                            }//격발 판정 if문 종료
                            //System.out.println(bullets);
                            //남은 총알


                        }//턴 반복 for문 종료
                    }//룰렛 반복 while문 종료
                    System.out.println("최종 생존자: " + Arrays.toString(players));
                    break;
                }//실탄 while문 종료
            }//게임 인원 if문 종료
            break;
        }//게임 인원 while문 종료

    }
}
