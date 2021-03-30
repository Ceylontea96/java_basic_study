package day13.exception;

public class AccMain {

    public static void main(String[] args) {

        Account account = new Account(1000);

        try {
        account.withDraw(50000);
        } catch (BalanceInsufficientException e) {
            //개발시에 에러로그확인에 도움을 줌
//            e.printStackTrace();//에러 로그를 보여줌
        }
        System.out.println(account.getBalance());
        System.out.println("프로그램 종료!");
    }
}
