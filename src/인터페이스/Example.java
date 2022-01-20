package 인터페이스;

public class Example {
    public static void main(String[] args) {
        ImplemtentationC impl = new ImplemtentationC();

        InterfaceA ia =impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();


    }
}
