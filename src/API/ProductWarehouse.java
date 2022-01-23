package API;
import java.util.*;

public class ProductWarehouse {
    private List<ProductInformation> list =new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int count =0;

    public void showInfo(){
        while (true){
            System.out.println("==========================");
            System.out.println("1. 등록     |2. 정보확인      |3. 종료");
            System.out.println("==========================");
            System.out.print("선택: ");
            int selectNo =sc.nextInt();
            switch (selectNo){
                case 1 : productRegistration();break;
                case 2 : showMeStorge();break;
                case 3 : return;
            }
        }

    }
    public void productRegistration(){  //1번 등록 메서드


        try{  ProductInformation productInfo = new ProductInformation();
            productInfo.setProductNo(count++);
        System.out.print("상품명: ");
        productInfo.setProductName(sc.next());
        System.out.print("가격: ");
        productInfo.setProductPrice(sc.nextInt());
        System.out.print("재고: ");
        productInfo.setInventory(sc.nextInt());
        list.add(productInfo);

        }catch(Exception e){
            System.out.println(e.getMessage()+"정확한 값을 입력하세요.");
        }
    }
    public void showMeStorge(){
        for(ProductInformation p : list){
            System.out.println("상품등록번호:  "+p.getProductNo()+" 번"+"\n"+"상품이름:  "+p.getProductName()+"\n"+"상품가격:  "+p.getProductPrice()+" 원"+"\n"+"재고개수:  "+p.getInventory()+"개");
        }
    }

}
