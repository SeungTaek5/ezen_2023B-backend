package 팀과제.팀과제3;

import java.util.Scanner;

public class MemberView {//class start

    // 싱글톤
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}


    public void run(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("======================================");
            System.out.println("1.계좌생성 | 2.예금 | 3.출금");
            System.out.println("======================================");
            System.out.print("기능을 선택해 주세요(1~3) => ");
            String ch = scanner.next();

            if (ch.equals("1")){//계좌생성
                System.out.println("======================================");
                System.out.println("1.신한은행 | 2.국민은행 | 3.농협은행");
                System.out.println("======================================");
                System.out.print("은행을 선택해주세요(1~3) : "); String bankCh = scanner.next();
                ////
                System.out.print("생성하실 계좌번호를 입력해주세요 : "); String accountNumber = scanner.next();
                System.out.print("계좌주 성함을 입력해주세요 : "); String name =scanner.next();
                부모은행 부모은행a = new 부모은행(accountNumber,name,0); // 계좌번호 , 계좌주 , 잔액

                if(Control.getInstance().계좌생성(부모은행a,bankCh)){
                    System.out.println("\n성공적으로 계좌가 생성되었습니다.\n");
                    for(int i=0; i<Dao.getInstance().신한배열.size(); i++) {
                        System.out.print(Dao.getInstance().신한배열.get(i).get계좌번호() + "  ");
                        System.out.print(Dao.getInstance().신한배열.get(i).get계좌주() + "  ");
                        System.out.print(Dao.getInstance().신한배열.get(i).get잔액() + "  ");
                        System.out.println(Dao.getInstance().신한배열.get(i).get마일리지());
                    }

                }else {
                    System.out.println("\n계좌생성에 실패하였습니다.\n");
                }

            } else if (ch.equals("2")) {//예금
                System.out.println("======================================");
                System.out.println("1.신한은행 | 2.국민은행 | 3.농협은행");
                System.out.println("======================================");
                System.out.print("은행을 선택해주세요(1~3) : "); String bankCh = scanner.next();
                //
                System.out.print("계좌번호를 입력해주세요 : "); String accountNumber = scanner.next();
                System.out.print("예금액을 입력해주세요 : "); int money =scanner.nextInt();
                부모은행 부모은행a = new 부모은행(accountNumber,"",money); // 계좌번호 , 계좌주 , 잔액

                if(Control.getInstance().예금(부모은행a,bankCh)){
                    System.out.println("\n안내] "+money+"원 입금성공하였습니다.\n");
                }else {
                    System.out.println("\n안내] 예금 실패하였습니다.\n");
                }

            } else if (ch.equals("3")) {//출금
                System.out.println("======================================");
                System.out.println("1.신한은행 | 2.국민은행 | 3.농협은행");
                System.out.println("======================================");
                System.out.print("은행을 선택해주세요(1~3) : "); String bankCh = scanner.next();
                ////
                System.out.print("계좌번호를 입력해주세요 : "); String accountNumber = scanner.next();
                System.out.print("출금액을 입력해주세요 : "); int money =scanner.nextInt();
                부모은행 부모은행a = new 부모은행(accountNumber,"",money); // 계좌번호 , 계좌주 , 잔액

                if(Control.getInstance().출금(부모은행a,bankCh)){
                    System.out.println("\n안내] "+money+"원 출금 성공하였습니다.\n");
                }else {
                    System.out.println("\n안내] 출금 실패하였습니다.\n");
                }

            }else {
                System.out.println("잘못입력하셧습니다.");
            }// if end

        }//while end

    }//run method end

}//calss end
