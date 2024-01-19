package 팀과제.팀과제3;

public class Control {
    // 싱글톤
    private Control(){}
    private static Control control = new Control();
    public static Control getInstance(){return control;}

    public boolean 계좌생성(부모은행 부모은행, String 선택한은행){
        if(Dao.getInstance().유효성검사(부모은행, 선택한은행)) {
            return Dao.getInstance().계좌생성(부모은행, 선택한은행);
        }
            return false;
    }
    public boolean 예금(부모은행 부모은행, String 선택한은행){
        boolean result = Dao.getInstance().예금(부모은행, 선택한은행);
        return result;
    }
    public boolean 출금(부모은행 부모은행, String 선택한은행){
        boolean result = Dao.getInstance().출금(부모은행, 선택한은행);
        return result;
    }
}
