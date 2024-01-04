package day03;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1번*****************************
        System.out.println("점수 입력 : ");
        int value = scanner.nextInt();

        if(value>=90){
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }

        // 2번*****************************
        if(value>=90){
            System.out.println("A등급");
        }
        else if(value>=80){
            System.out.println("B등급");
        }
        else if(value>=70){
            System.out.println("C등급");
        }
        else{
            System.out.println("재시험");
        }

        // 3번*****************************

        // 4번*****************************
        int 가위 = 0; int 바위 = 1; int 보 = 2;

        System.out.println("플레이어1 : "); int 플레이어1 = scanner.nextInt();
        System.out.println("플레이어2 : "); int 플레이어2 = scanner.nextInt();

        if(플레이어1 - 플레이어2 == 0){
            System.out.println("무승부");
        }
        else if(플레이어1 - 플레이어2 > 0 || 플레이어1 - 플레이어2 == -2){
            System.out.println("플레이어1 승리");
        }
        else{
            System.out.println("플레이어2 승리");
        }

        // 5번*****************************
//        System.out.print(" 연도 입력 : ");
//        int year = scanner.nextInt();
//        if(year % 4 == 0){
//            if(year % 100 ==0) {
//                if(year % 400 == 0){
//                    System.out.println("입력한" + year + "년은 윤년입니다.");
//                    return;
//                }
//                System.out.println("입력한" + year + "년은 평년입니다.");
//                return;
//            }
//            System.out.println("입력한 " + year + "년은 윤년입니다.");
//        }

        System.out.print(" 연도 입력 : ");
        int year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 ==0 && year % 400 == 0){
            System.out.println("입력한 " + year + "년은 윤년입니다.");
        }
        else if(year % 4 == 0 && year % 100 ==0){
            System.out.println("입력한 " + year + "년은 평년입니다.");
        }
        else if(year % 4 == 0) {
            System.out.println("입력한 " + year + "년은 윤년입니다.");
        }

        // 6번*****************************
        int 시 = 14; int 분 = 30; int 요금 = 1000; int 사용요금 = 0;
        System.out.println("현재 시간을 입려하세요 : "); int 현재시 = scanner.nextInt();
        System.out.println("현재 분을 입려하세요 : "); int 현재분 = scanner.nextInt();

        if(현재시 < 14){
            System.out.println("현재시간오류");
        }
        else if(현재시==14 && 분<30){
            System.out.println("현재시간오류");
        }
        else{
            if(현재시==14){
                사용요금 = (현재분-30)*요금;
                System.out.println("사용요금 : " + 사용요금);
            }
            else{
                사용요금 = (현재시-15)*요금*60 + 현재분*요금 + 요금*30;
                System.out.println("사용요금 : " + 사용요금);
            }
        }

        // 7번*****************************
        System.out.print("아이디 : ");
        String 아이디 = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String 비번 = scanner.nextLine();

        if(아이디.equals("admin") && 비번.equals("1234")){
            System.out.println("로그인 성공");
        }
        else if(아이디.equals("admin")){
            System.out.println("비밀번호 정보가 일치하지 않습니다.");
        }
        else{
            System.out.println("아이디 정보가 일치하지 않습니다.");
        }

        // 8번*****************************
        int a7 = scanner.nextInt();
        int b7 = scanner.nextInt();
        int c7 = scanner.nextInt();
        int 공1 = 14; int 공2=21; int 공3=9;
        int result = 0;

        if(a7==공1|| a7==공2||a7==공3){
            result++;
        }
        if(b7==공1|| b7==공2||b7==공3){
            result++;
        }
        if(c7==공1|| c7==공2||c7==공3){
            result++;
        }
        System.out.println(result);

    }
}
