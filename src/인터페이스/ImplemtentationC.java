package 인터페이스;

public class ImplemtentationC implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA()실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB()실행");
    }

    @Override
    public void methodC() {
        System.out.println("ImplmentationC-methodC()실행");
    }
}
