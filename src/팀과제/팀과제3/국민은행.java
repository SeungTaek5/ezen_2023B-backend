package 팀과제.팀과제3;

public class 국민은행 extends 부모은행{
    private String 쿠폰;


    public 국민은행() {}

    public 국민은행(String 계좌번호, String 계좌주, int 잔액, String 쿠폰) {
        super(계좌번호, 계좌주, 잔액);
        this.쿠폰 = 쿠폰;
    }

    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }
}
