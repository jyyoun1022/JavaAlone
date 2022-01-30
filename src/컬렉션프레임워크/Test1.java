package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동",27);  //객체 추가
        int score =map.get("홍길동");   //객체 찾기
        System.out.println(map.values());
        map.remove("홍길동");  //객체 삭제

    }
}