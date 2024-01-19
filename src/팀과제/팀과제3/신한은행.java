package 팀과제.팀과제3;

public class 신한은행 extends 부모은행{
    private int 마일리지;

    public 신한은행() {}

    public 신한은행(String 계좌번호, String 계좌주, int 잔액, int 마일리지) {
        super(계좌번호, 계좌주, 잔액);
        this.마일리지 = 마일리지;
    }

    public int get마일리지() {
        return 마일리지;
    }

    public void set마일리지(int 마일리지) {
        this.마일리지 = 마일리지;
    }


}
