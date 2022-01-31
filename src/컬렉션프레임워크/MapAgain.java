package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapAgain {
    public static void main(String[] args) {
        Map<String,Integer>map = new HashMap<>();

        map.put("홍길동",12);
        map.put("윤재열",100);
        map.put("이순신",12);
        map.put("매향수",12);
        System.out.println("개수: "+map.size());


        System.out.println(map.get("윤재열"));

        //객체를 하나씩 처리하는거 해보자
        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        Iterator<Map.Entry<String,Integer>>entryIterator= entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

        }



    }
}
