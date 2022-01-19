package 추상클래스;

public class HttpServiletExample  {
    public static void main(String[] args) {
        method(new LoginServlet());
        method(new FileDownloadServlet());
    }
    public static void method(HttpServlet servlet){
        servlet.service();
    }
}
