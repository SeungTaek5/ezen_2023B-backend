package day20;

public class Step3 {
    InterfaceCImpl imp1 = new InterfaceCImpl();

    InterfaceA ia = imp1;

    //ia.methodA();

    InterfaceB ib = imp1;
    //ib.methodB();
}
