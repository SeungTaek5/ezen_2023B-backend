package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {

    /*
        0. Class.forName("JDBC드라이버 클래스경로");
            - 해당 클래스 찾아서 JDBC드라이버 객체(DriverManager) 자동 등록 한다.

        1. [클래스] DriverManager
            DriverManager.getConnection("jdbc:mysql://ip번호:port번호/db명" , "계정명" ,"비밀번호")

        2. [인터페이스] Connection
            - Statement, PreparedStatement 구현 객체를 반환한다.
            - connection.preparedStatement( SQL )

        3. [인터페이스] PreparedStatement
            - DDL, DML문을 실행 할 때 사용한다.
            - insert, update, delete => .executeUpdate();
            - select => .executeQuery();

        4. [인터페이스] ResultSet
            - DB에서 가져온 데이터를 읽을때 사용한다.
            1. 다음 레코드 이동 : next() 다음 레코드 이동 후 존재하면 true / 없으면 false 반환
            2. 현재 레코드에서 필드 값 호출 : .get타입( 호출할 필드순서번호 or 필드명 )


    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            // 1. DB 연동
            // 1. mysql 드라이버를 메모리(드라이버객체 등록)에 로딩한다.
            // 2. 예외처리 필수 : try{ }catch( 예외클래스명 매개변수 ){ }
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. 위에서 등록된 드라이버객체를 이용한 db연동(jdbc:mysql://ip번호:port번호/db명, 계정, 비밀번호)
            // * 예외처리 필수
            // * 연동성공시 반환객체 : Connection 객체
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test5",
                    "root",
                    "1234"
            );
            System.out.println("DB연동 성공");
        }catch (Exception e){ System.out.println(e); }

        while (true){

            System.out.println("1. 삽입 2.출력 3.수정 4.삭제");
            System.out.println("선택> ");

            try {
                int ch = scanner.nextInt();

                if(ch==1){ // 삽입
                    System.out.print("저장 고객명 : "); String name = scanner.next();
                    //connection.prepareStatement("insert into members ").executeUpdate();
                    String sql = "insert into member values('"+name+"')";
                    System.out.print(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }
                else if(ch==2){ // 출력
                    String sql = "select * from member";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery(); // select 결과물 가지고 있는 인터페이스

                    while(resultSet.next()){ // 검색결과내 첫번째 레코드부터 마지막 레코드까지 순회.
                        // 하나씩 next()로 레코드를 이동하면서 반복처리 만약 다음 레코드가 존재하면 실행
                        // 다음 레코드가 존재하지 않으면 false 이므로 while 종료
                        //System.out.println(resultSet.getString(1));
                        System.out.println(resultSet.getString("mname"));
                    }

                }
                else if(ch==3){ // 수정
                    System.out.print("수정할 고객명 : "); String oldName = scanner.next();
                    System.out.print("새로운 고객명 : "); String newName = scanner.next();
                    String sql = "update member set mname = '"+newName+"' where mname = '"+oldName+"' ";
                    System.out.print(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }
                else if(ch==4){ // 삭제
                    System.out.print("삭제할 고객명 : "); String deleteName = scanner.next();
                    String sql = "delete from member where mname = '"+deleteName+"' ";
                    System.out.print(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }

            }catch (InputMismatchException e){
                System.out.println("<시스템오류> 정상적인 입력값이 아닙니다.");
                scanner = new Scanner(System.in); // 기존에 입력받은 바이트를 지우기
            }catch (SQLException e){
                System.out.println("<시스템오류> SQL 문법 오류입니다.");
            }
        }



    }
}
