package day06;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //관리자 id 관리
        String[] admin = {"admin", "admin1234"};//관리자 id, 관리자 passwd, 관리자 계정 코드
        //회원관리 배열
        String[][] memberData = {{"none", "none"}};

        int memNum = 0;
        //권한 부여
        boolean adminAccess = false;

        boolean end = false;//프로그램 종료 판별 논리값
        boolean hasId = false;
        boolean hasPasswd = false;
        boolean login = false; //로그인 여부 판단 논리값
        //회원가입

        System.out.print("* 회원 ID >  ");
        System.out.print("* 비밀번호 >  ");
        System.out.print("* 비밀번호 확인 >  ");
        while (true) {

            System.out.println("환영");
            while (true) {//로그인 or 회원가입 선택
                adminAccess = false;//재 로그인시 부여된 관리자 권한 상실
                System.out.println("# 1. [로그인]");
                System.out.println("# 2. [회원가입]");
                System.out.println("# 3. [프로그램 종료]");
                System.out.println(memberData.length);

                System.out.print("> ");
                int loginChoice = sc.nextInt();

                switch (loginChoice) {
                    case 1://로그인
                        System.out.print("* 회원 ID >  ");
                        String idInsert = sc.next();
                        hasId = false;

                        if (idInsert.equals(admin[0])) {
                            hasId = true;

                            System.out.print("* 비밀번호 >  ");
                            String pwInsert = sc.next();

                            if (pwInsert.equals(admin[1])) {
                                login = true;
                                adminAccess = true;
                                break;
                            } else {
                                System.out.println("- 잘못된 비밀번호입니다.");
                            }
                        }//로그인 시도 id가 관리자 id인지 여부 판별 if문 종료

                        for (int i = 0; i < memberData.length; i++) {
                            if (memberData[i][0].equals(idInsert)) {
                                hasId = true;

                                System.out.print("* 비밀번호 > ");
                                String pwInsert = sc.next();

                                if (memberData[i][1].equals(pwInsert)) {
                                    login = true;
                                } else {
                                    System.out.println("- 잘못된 비밀번호입니다.");
                                }
                            }//일반회원 아이디 여부 판별 if문 종료
                        }
                        if (!hasId) {
                            System.out.println("- 해당 ID는 존재하지 않습니다.");
                        }

                        break;

                    case 2://회원가입
                        System.out.println("# 회원가입을 진행합니다.");

                        String[] member = new String[2];

                        while (true) {

                            System.out.print("* 회원 ID >  ");
                            String newId = sc.next();

                            boolean idOk = true;//id중복여부 판단 논리값
                            if (newId.equals(admin[0])) {
                                idOk = false;
                            }
                            for (int i = 0; i < memberData.length; i++) {
                                //이미 만들어진 id와 비교하여 중복 체크 후 중복이면 id 재입력
                                if (memberData[i][0].equals(newId)) {
                                    idOk = false;
                                }
                            }
                            //
                            if (!idOk) {
                                System.out.println("중복된 ID입니다.");
                            } else {
                                member[0] = newId;

                                while (true) {
                                    System.out.print("* 비밀번호 >  ");
                                    member[1] = sc.next();
                                    System.out.print("* 비밀번호 확인 >  ");
                                    String confirmPw = sc.next();
                                    if (member[1].equals(confirmPw)) {
                                        String[][] temp = new String[(memNum + 1)][2];
                                        temp[memNum] = member; member = null;
                                        memberData = temp; temp = null;
                                        memNum++;
                                        break;
                                    } else {
                                        System.out.println("- 비밀번호를 다시 확인해주세요.");
                                    }
                                }
                                break;
                            }

                        }

                        System.out.println("- 회원가입이 완료되었습니다.");
                        break;
                    case 3:
                        end = true;
                        break;
                    default:
                        System.out.println("- [로그인], [회원가입], [프로그램 종료] 중에서 선택해주세요.");
                        continue;
                }//로그인 switch문 종료
                if ((login) | (end)) break;//로그인 성공시 혹은 프로그램 종료시 반복문 종료
            }//로그인 while문 종료
            while (login) {
                if (adminAccess) {
                    System.out.println("환영합니다 관리자 ID로 로그인하셨습니다.");
                }
                break;
            }
            if (end) {//프로그램 종료
                System.out.println("도서관리 프로그램을 종료합니다.");
                break;
            }
        }

    }
}
