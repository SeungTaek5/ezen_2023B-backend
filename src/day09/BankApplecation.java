package day09;

import java.util.Scanner;

public class BankApplecation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] account = new Account[100];

        while (true){

            System.out.println("----------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            if(ch == 1){
                System.out.println("----------");
                System.out.println("계좌생성");
                System.out.println("----------");

                System.out.print("계좌번호 : "); String 계좌번호 = scanner.next();
                System.out.print("계좌주 : "); String 계좌주 = scanner.next();
                System.out.print("초기입금액 : "); int 입금액 = scanner.nextInt();
                System.out.print("결과 : ");
            }
            else if(ch == 2){}
            else if(ch == 3){}
            else if(ch == 4){}
            else if(ch == 5){
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
