package API;
import java.util.Scanner;
import java.util.*;

public class ProductStorage {
    private List<Product> list = new ArrayList<>(); //list컬렉션 생성
    private Scanner sc= new Scanner(System.in);
    private int counter;    //pno 제공 카운터

    public void showMEnu(){
        while(true){
            System.out.println("=======================================");
            System.out.println("1. 등록  | 2. 목록  | 3. 종료");
            System.out.println("=======================================");

            System.out.print("선택: ");
            String selectNo =sc.nextLine();
            switch (selectNo){
                case "1" : registerProductor(); break;
                case "2" : showProduct(); break;
                case "3" : return;
            }
        }
    }
    public void registerProductor(){
        try{Product product = new Product();
            product.setPno(++counter);  //pno세팅

            System.out.print("상품명: ");
            product.setName(sc.nextLine());

            System.out.print("가격: ");
            product.setPrice(Integer.parseInt(sc.nextLine()));

            System.out.print("재고: ");
            product.setStock(Integer.parseInt(sc.nextLine()));

            list.add(product);  //list에 product저장

    }catch (Exception e){
            System.out.println(e.getMessage());
        }
}
public void showProduct(){
        for(Product product : list){
            System.out.println("물건번호: "+product.getPno()+"\n"+"상품명: "+product.getName()+"\t"+"가격: "+product.getPrice()+"\t"+"재고: " +product.getStock());
        }
    }
}
