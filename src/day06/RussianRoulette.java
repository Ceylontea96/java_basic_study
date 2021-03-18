package day06;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean end = true;
        while (end) {
            System.out.print("게임 인원 (2 ~ 4명) ==> ");
            int number = sc.nextInt();

            if (number >= 2 && number <= 4) {

                String[] players = new String[number];
                System.out.println("플레이어 이름을 등록합니다.");
                for (int i = 0; i < number; i++) {
                    System.out.print((i + 1) + "번 플레이어 이름: ");
                    players[i] = sc.next();
                }
                System.out.println(Arrays.toString(players) + " 참가!\n");

                while (end) {
                    System.out.print("실탄 개수 (6미만) ==> ");
                    int bullets = sc.nextInt();

                    if (bullets < 6 && bullets > 0) {
                        boolean[] cylinder = new boolean[6];
                        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.\n");
                        for (int i = 0; i < bullets; i++) {
                            int ran = (int) (Math.random() * 6);
                            if (cylinder[ran] != true) {
                                cylinder[ran] = true;
                            } else {
                                i--;
                            }
                        }//탄창에 실탄 장전 완료
                        System.out.println(Arrays.toString(cylinder));

                        int turn = (int) (Math.random() * number);

                        //
                        System.out.println("총을 돌렸습니다. " + players[turn] + "부터 시작합니다.\n\n");

                        //턴 반복 시작
                        for (int i = 0; i < players.length; i++) {
                            if (turn + 1 < players.length) {
                                System.out.println("[" + players[turn + i] + "의 턴!] 탄창을 무작위로 돌립니다.");
                                System.out.println("# 엔터를 누르면 격발합니다.");
                                sc.nextLine();
                                sc.nextLine();
                                //맞았는지 판단

                                int bang = (int) (Math.random() * 6);
                                // 실린더를 매번 돌릴경우 아래와 같이
                                if (bang < 6) {
                                    //실린더를 매번 돌리지 않을경우 bang++;
                                    if (cylinder[bang] == true) {
                                        System.out.println("빵!!! 사망...");
                                        cylinder[bang] = false;
                                        bullets--;
                                        //목록에서 삭제
                                        int idx = turn + i;

                                        for (int j = idx; j < players.length - 1; j++) {
                                            players[j] = players[j + 1];
                                        }

                                        String[] temp = new String[players.length - 1];
                                        for (int j = 0; j < temp.length; j++) {
                                            temp[j] = players[j];
                                        }
                                        players = temp;
                                        temp = null;

                                    } else {
                                        System.out.println("휴..... 살았습니다.");
                                    }
                                } else {
                                    turn = 0;
                                    i = 0;
                                }
                                if (players.length == 0 | bullets == 0) {
                                    break;
                                }

                            } else {
                                turn = 0;
                                i = 0;
                                continue;
                            }
                            /*else {
                                bang = 0;
                            }
                            */


                        } /* 여기까지 턴반복 for문 */break;


                    } else {
                        System.out.println("실탄은 6개 미만으로 설정해야합니다.");
                    } //실탄 if문
                }//실탄 while
                System.out.println("최종 생존자: " + Arrays.toString(players));
                break;
            } else {
                System.out.println("2 ~ 4 명만 플레이가 가능합니다.");
            }
        }//참가 인원수 while
        //최종 종료 후 최종생존자 출력

    }
}
