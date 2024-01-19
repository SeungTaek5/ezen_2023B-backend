package 팀과제.팀과제3;

public class 부모은행 {

    private String 계좌번호;
    private String 계좌주;
    private int 잔액;
    public 부모은행(){}

    public 부모은행(String 계좌번호, String 계좌주, int 잔액){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.잔액 = 잔액;
    }

    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public String get계좌주() {
        return 계좌주;
    }

    public void set계좌주(String 계좌주) {
        this.계좌주 = 계좌주;
    }

    public int get잔액() {
        return 잔액;
    }

    public void set잔액(int 잔액) {
        this.잔액 = 잔액;
    }
}
