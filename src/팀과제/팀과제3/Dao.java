package 팀과제.팀과제3;

import java.util.ArrayList;

public class Dao {
    // 싱글톤
    private Dao(){}
    private static Dao dao = new Dao();
    public static Dao getInstance(){return dao;}

    ArrayList<신한은행> 신한배열=new ArrayList<>();
    ArrayList<국민은행> 국민배열=new ArrayList<>();
    ArrayList<농협은행> 농협배열=new ArrayList<>();


    public boolean 계좌생성(부모은행 부모은행a, String 선택한은행){//계좌생성

        if(선택한은행.equals("1")){
            신한은행 temp=new 신한은행();
            temp.set계좌번호(부모은행a.get계좌번호());
            temp.set계좌주(부모은행a.get계좌주());
            temp.set잔액(부모은행a.get잔액());
            temp.set마일리지(0);
            신한배열.add(temp);

            //2.
            /*신한은행 temp신한배열=(신한은행)부모은행a;
            temp신한배열.set마일리지(0);
            신한배열.add(temp신한배열);
            System.out.println();*/

            return true;
        }
        else if(선택한은행.equals("2")){
            국민은행 temp=new 국민은행();
            temp.set계좌번호(부모은행a.get계좌번호());
            temp.set계좌주(부모은행a.get계좌주());
            temp.set잔액(부모은행a.get잔액());
            temp.set쿠폰("");
            국민배열.add(temp);

            return true;
        }
        else if(선택한은행.equals("3")){
            농협은행 temp=new 농협은행();
            temp.set계좌번호(부모은행a.get계좌번호());
            temp.set계좌주(부모은행a.get계좌주());
            temp.set잔액(부모은행a.get잔액());
            temp.set포인트(0);
            농협배열.add(temp);

            return true;
        }
            return false;
    }//m end

    public boolean 예금(부모은행 부모은행a, String 선택한은행){//예금
        if(선택한은행.equals("1")){//신한은행 예금
            for(int i=0; i<신한배열.size(); i++){
                if(부모은행a.get계좌번호().equals(신한배열.get(i).get계좌번호())){
                    int totalMoney=신한배열.get(i).get잔액()+부모은행a.get잔액();
                    신한배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==1
        else if(선택한은행.equals("2")){//국민은행 예금
            for(int i=0; i<국민배열.size(); i++){
                if(부모은행a.get계좌번호().equals(국민배열.get(i).get계좌번호())){
                    int totalMoney=국민배열.get(i).get잔액()+부모은행a.get잔액();
                    국민배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==2
        else if(선택한은행.equals("3")){//농협은행 예금
            for(int i=0; i<농협배열.size(); i++){
                if(부모은행a.get계좌번호().equals(농협배열.get(i).get계좌번호())){
                    int totalMoney=농협배열.get(i).get잔액()+부모은행a.get잔액();
                    농협배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==3

            return false;
    }//m end

    public boolean 출금(부모은행 부모은행a, String 선택한은행){//출금
        if(선택한은행.equals("1")){
            for(int i=0; i<신한배열.size(); i++){
                if(부모은행a.get계좌번호().equals(신한배열.get(i).get계좌번호())){
                    int totalMoney=신한배열.get(i).get잔액()-부모은행a.get잔액();
                    신한배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==1
        if(선택한은행.equals("2")){
            for(int i=0; i<국민배열.size(); i++){
                if(부모은행a.get계좌번호().equals(국민배열.get(i).get계좌번호())){
                    int totalMoney=국민배열.get(i).get잔액()-부모은행a.get잔액();
                    국민배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==1
        if(선택한은행.equals("3")){
            for(int i=0; i<농협배열.size(); i++){
                if(부모은행a.get계좌번호().equals(농협배열.get(i).get계좌번호())){
                    int totalMoney=농협배열.get(i).get잔액()-부모은행a.get잔액();
                    농협배열.get(i).set잔액(totalMoney);
                    return true;
                }//if end
            }//for end
        }//if end 선택한은행==1

        return false;
    }//m end

    public boolean 유효성검사(부모은행 부모은행a, String 선택한은행){//유효성검사
        if(선택한은행.equals("1")){
            for(int i=0; i<신한배열.size(); i++){
                if(부모은행a.get계좌번호().equals(신한배열.get(i).get계좌번호())){
                    return false;
                }
            }//for end
        }//if end 선택한은행==1
        if(선택한은행.equals("2")){
            for(int i=0; i<국민배열.size(); i++){
                if(부모은행a.get계좌번호().equals(국민배열.get(i).get계좌번호())){
                    return false;
                }
            }//for end
        }//if end 선택한은행==1
        if(선택한은행.equals("3")){
            for(int i=0; i<농협배열.size(); i++){
                if(부모은행a.get계좌번호().equals(농협배열.get(i).get계좌번호())){
                    return false;
                }
            }//for end
        }//if end 선택한은행==1
        return true;
    }//m end
}//c end
