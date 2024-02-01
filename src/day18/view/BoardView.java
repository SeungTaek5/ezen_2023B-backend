package day18.view;

import day18.controller.MemberController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {//class start
    // 싱글톤
    private BoardView(){}
    private static BoardView boardView= new BoardView();
    public static BoardView getInstance(){return boardView;}
    // 입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 0. 로그인 성공시 출력되는 화면.
    public void run(){
        while (true){
            System.out.println("============== 으냐 게시판 ==============");
            // 추후에 현재 게시물을 출력 해소드가 들어갈 자리
            System.out.println(" 1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("선택 > ");int ch = scanner.nextInt();
            try {
                if (ch == 1) {// 글쓰기

                } else if (ch == 2) {// 글보기

                } else if (ch == 3) {//로그아웃
                    System.out.println("로그아웃 되었습니다.");
                    MemberController.getInstance().logout(); // 로그아웃 처리요청
                    return; // 현재 메소드 종료
                }
            }catch (InputMismatchException e){
                System.out.println("숫자로 입력해주세요" + e);
            }


        }// while end
    }// run method end
}//class end