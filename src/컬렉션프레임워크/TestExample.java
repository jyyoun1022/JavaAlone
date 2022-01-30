package 컬렉션프레임워크;


import 인터페이스.InterfaceC;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 92);
        map.put("동장군", 78);
        map.put("홍길동", 99);  //이름이 "홍길동"으로 키가 같기 때문에 마지막에 저장한 값으로 대체
        map.put("나연습", 87);
        System.out.println("총 Entry 수 : " + map.size());  //저장된 총 Entry 수 얻기

        //객체 찾기
        System.out.println("홍길동\t" + map.get("홍길동"));
        System.out.println();

        //객체를 하나씩 처리
        Set<String> keySet = map.keySet();//key Set 얻기
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {   //반복해서 키를 얻고 값을 Map에서 얻어낸다.
            String key = keyIterator.next();    //keyIterator.hasNext()가 true라고 한다면 컬렉션에서 하나의 객체를 가져옵니다.
            Integer value = map.get(key);
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        //객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        //객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();  //Map.Entry set 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ":" + value);
        }
        System.out.println();

        map.clear();
        System.out.println("총 Entry 수 : " + map.size());


    }
}
